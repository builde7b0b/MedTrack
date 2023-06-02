package com.api.MedTrackAPI.service;

import com.api.MedTrackAPI.InventoryManagementSystem;
import com.api.MedTrackAPI.model.Medication;
import com.api.MedTrackAPI.repository.MedicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryManagementSystemService implements InventoryManagementSystem {

    @Autowired
    private MedicationRepository medicationRepository;
    @Override
    public List<Medication> getCurrentInventory() {
        return null;
    }

    @Override
    public Medication detectLowStock() {
        return null;
    }

    @Override
    public List<Medication> detectExpiringMedications() {
        return null;
    }
}
