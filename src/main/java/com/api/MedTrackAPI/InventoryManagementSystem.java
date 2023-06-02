package com.api.MedTrackAPI;

import com.api.MedTrackAPI.model.Medication;

import java.util.List;

public interface InventoryManagementSystem {

    List<Medication> getCurrentInventory();
    Medication detectLowStock();
    List<Medication> detectExpiringMedications();

}
