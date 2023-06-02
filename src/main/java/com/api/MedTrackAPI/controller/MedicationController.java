package com.api.MedTrackAPI.controller;

import com.api.MedTrackAPI.model.Medication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medications")
public class MedicationController {

    @Autowired
    private MedicationService medicationService;

    @PostMapping
    public Medication createMedication(){
        return medicationService.createMedication(medication);
    }

    @GetMapping("/{medicationId}")
    public Medication getMedication(@PathVariable Long medicationId){
        return medicationService.getMedication(medicationId);

    }

    @PutMapping("/{medicationId}")
    public Medication updateMedication(@PathVariable Long medicationId, @RequestBody Medication medication) {
        return medicationService.updateMedication(medicationId, medication);
    }

    @DeleteMapping("/{medicationId}")
    public void deletedMedication(@PathVariable  Long medicationId) {
        medicationService.deleteMedication(medicationId);
    }






}
