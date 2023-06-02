package com.api.MedTrackAPI.service;

import com.api.MedTrackAPI.InventoryManagementSystem;
import com.api.MedTrackAPI.model.Medication;

import java.util.List;

public class InventoryManagementSystemService implements InventoryManagementSystem {
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
