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

    public Supplier updateSupplier(Long supplierId, Supplier updatedSupplier) {
        Supplier existingSupplier = supplierRepository.findById(supplierId)
                .orElseThrow(() -> new ResourceNotFoundException("Supplier not found with id: " + supplierId));

        existingSupplier.setName(updatedSupplier.getName());
        existingSupplier.setContactInfo(updatedSupplier.getContactInfo());

        return supplierRepository.save(existingSupplier);
    }

    public void deleteSupplier(Long supplierId) {
        // check if supplier exists before deleting
        if (supplierRepository.existsById(supplierId)) {
            supplierRepository.deleteById(supplierId);
        } else {
            throw new ResourceNotFoundException("Supplier not found with id: " + supplierId);
        }
    }
}
