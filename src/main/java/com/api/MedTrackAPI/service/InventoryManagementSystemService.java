package com.api.MedTrackAPI.service;

import com.api.MedTrackAPI.InventoryManagementSystem;
import com.api.MedTrackAPI.model.Medication;
import com.api.MedTrackAPI.repository.MedicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class InventoryManagementSystemService implements InventoryManagementSystem {

    private static final int LOW_STOCK_THRESHOLD = 10;
    private static final int EXPIRATION_THRESHOLD = 30;



    @Autowired
    private MedicationRepository medicationRepository;
    @Override
    public List<Medication> getCurrentInventory() {
        return medicationRepository.findAll();
    }

    @Override
    public Medication detectLowStock() {
        List<Medication> inventory = medicationRepository.findAll();

        // logic, loop over inventory and check quantity
        for (Medication medication : inventory) {
            if (medication.getQuantity() < LOW_STOCK_THRESHOLD) {
                return medication;
            }
        }

        return null; // return null if no medication is found
    }

    @Override
    public List<Medication> detectExpiringMedications() {
        LocalDate today = LocalDate.now();
        List<Medication> inventory = medicationRepository.findAll();

        // logic to detect medications nearing exp
        // check expiration date of each medication
        List<Medication> expiringMedications = new ArrayList<>();
        for(Medication medication : inventory) {
            if (medication.getExpirationDate().isBefore(today.plusDays(EXPIRATION_THRESHOLD))) {

                expiringMedications.add(medication);
            }
        }

        return expiringMedications;
    }
}
