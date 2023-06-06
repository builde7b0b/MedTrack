package com.api.MedTrackAPI.service;

import com.api.MedTrackAPI.model.Medication;
import com.api.MedTrackAPI.repository.MedicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicationService {
    @Autowired
    private MedicationRepository medicationRepository;

    public Medication createMedication(Medication medication){
        return medicationRepository.save(medication);
    }

    public Medication getMedication(Long medicationId) {
        return medicationRepository.findById(medicationId)
                .orElseThrow(() -> new ResourceNotFoundException("Medication not found with id: " + medicationId));
    }

    public List<Medication> getAllMedications() {
        return medicationRepository.findAll();
    }

    public Medication updateMedication(Long medicationId, Medication updatedMedication) {
        Medication existingMedication = medicationRepository.findById(medicationId)
                .orElseThrow(() -> new ResourceNotFoundException("Medication not found with id: " + medicationId));
                // update existing medication with new data
        existingMedication.setName(updatedMedication.getName());
        existingMedication.setQuantity(updatedMedication.getQuantity());
        existingMedication.setExpirationDate(updatedMedication.getExpirationDate());
        return medicationRepository.save(existingMedication);
    }

    public void deleteMedication(Long medicationId){
        Medication existingMedication = medicationRepository.findById(medicationId)
                .orElseThrow(() -> new ResourceNotFoundException("Medication not found with id: " + medicationId));
        medicationRepository.delete(existingMedication);
    }



}
