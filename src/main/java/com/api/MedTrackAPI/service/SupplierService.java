package com.api.MedTrackAPI.service;

import com.api.MedTrackAPI.model.Supplier;
import com.api.MedTrackAPI.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    public Supplier createSupplier(Supplier supplier) {
    return supplierRepository.save(supplier);
    }

    public Supplier getSupplier(Long supplierId) {
        return supplierRepository.findById(supplierId)
                .orElseThrow(() -> new ResourceNotFoundException("Supplier not found with it: " + supplierId));
    }
}
