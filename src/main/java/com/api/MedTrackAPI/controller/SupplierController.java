package com.api.MedTrackAPI.controller;

import com.api.MedTrackAPI.model.Supplier;
import com.api.MedTrackAPI.service.SupplierService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/suppliers")
public class SupplierController {

    private SupplierService supplierService;

    public Supplier createSupplier(@RequestBody Supplier supplier) {
        return supplierService.createSupplier(supplier);
    }

    @GetMapping("/{supplierId})")
    public Supplier getSupplier(@PathVariable Long supplierId) {
        return supplierService.getSupplier(supplierId);
    }

    @PutMapping("/{supplierId}")
    public Supplier updateSuplier(@PathVariable Long supplierId, @RequestBody Supplier supplier) {
        return supplierService.updateSupplier(supplierId, supplier);
    }

    @DeleteMapping("/{supplierId}")
    public void deleteSupplier(@PathVariable Long supplierId) {
        supplierService.deleteSupplier(supplierId);
    }
}
