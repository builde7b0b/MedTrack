package com.api.MedTrackAPI.service;

import com.api.MedTrackAPI.model.Medication;
import org.springframework.stereotype.Service;

@Service
public class AlertService {

    public void sendLowStockAlert(Medication medication) {
        try {
            // Implmenetation for sendint the alert
            // define the specific notification mech,
            // exmaple: sending an email noti
            String subject = "Low stock alert";
            String message = "THe medication " + medication.getName() + " has low stock. Quantity left: " + medication.getQuantity();
            String recipientEmail = "pharmacymanager@example.com";

            // call the method to send an email

        }
    }
}
