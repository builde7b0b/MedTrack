package com.api.MedTrackAPI.controller;

import com.api.MedTrackAPI.model.Supplier;
import com.api.MedTrackAPI.service.SupplierService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/suppliers")
@Tag(name = "Supplier API")
public class SupplierController {

    private SupplierService supplierService;

    public Supplier createSupplier(@RequestBody Supplier supplier) {
        return supplierService.createSupplier(supplier);
    }

    @Operation(summary = "Get a Supplier")
    @GetMapping("/{supplierId})")
    public Supplier getSupplier(@PathVariable Long supplierId) {
        return supplierService.getSupplier(supplierId);
    }

    @Operation(summary = "Update a Supplier")
    @PutMapping("/{supplierId}")
    public Supplier updateSupplier(@PathVariable Long supplierId, @RequestBody Supplier supplier) {
        return supplierService.updateSupplier(supplierId, supplier);
    }

    @Operation(summary = "Delete a Supplier")
    @DeleteMapping("/{supplierId}")
    public void deleteSupplier(@PathVariable Long supplierId) {
        supplierService.deleteSupplier(supplierId);
    }
}
