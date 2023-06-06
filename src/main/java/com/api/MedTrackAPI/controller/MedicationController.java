package com.api.MedTrackAPI.controller;

import com.api.MedTrackAPI.model.Medication;
import com.api.MedTrackAPI.service.MedicationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medications")
@Tag(name =  "Prescription API")
public class MedicationController {

    @Autowired
    private MedicationService medicationService;

    @PostMapping
    public Medication createMedication(@RequestBody Medication medication){
        return medicationService.createMedication(medication);
    }

    @Operation(summary = "Get a single Medication")
    @GetMapping("/{medicationId}")
    public Medication getMedication(@PathVariable Long medicationId){
        return medicationService.getMedication(medicationId);

    }

    @Operation(summary = "Get all Medications")
    @GetMapping("/")
    public List<Medication> getAllMedications() {
        return medicationService.getAllMedications();
    }

    @Operation(summary = "Update Medication")
    @PutMapping("/{medicationId}")
    public Medication updateMedication(@PathVariable Long medicationId, @RequestBody Medication medication) {
        return medicationService.updateMedication(medicationId, medication);
    }

    @Operation(summary = "Delete a Medication")
    @DeleteMapping("/{medicationId}")
    public void deleteMedication(@PathVariable  Long medicationId) {
        medicationService.deleteMedication(medicationId);
    }

}
