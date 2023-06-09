package com.api.MedTrackAPI.service;

import com.api.MedTrackAPI.model.Medication;
import com.api.MedTrackAPI.model.Order;
import com.api.MedTrackAPI.repository.MedicationRepository;
import com.api.MedTrackAPI.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    private final OrderRepository orderRepository;

    private final MedicationRepository medicationRepository;

    public OrderService(MedicationRepository medicationRepository, OrderRepository orderRepository) {
        this.medicationRepository = medicationRepository;
        this.orderRepository = orderRepository;
    }


    public List<Order> generateReorderSuggestions() {
        List<Order> reorderSuggestions = new ArrayList<>();
        List<Medication> medications = medicationRepository.findAll();
        int threshold = 5; // replace with whatever the threshold is

        for (Medication medication : medications) {
            int stockLevel = medication.getQuantity();

            if (stockLevel < threshold) {
                Order reorderOrder = createReorderOrder(medication);
                reorderSuggestions.add(reorderOrder);
            }
        }

        return reorderSuggestions;
    }

    private Order createReorderOrder(Medication medication) {
        // create an order obj based on medication details and return it
        Order reorderOrder = new Order();
        reorderOrder.setMedication_id(medication.getMedication_Id());
        return reorderOrder;
    }


}
