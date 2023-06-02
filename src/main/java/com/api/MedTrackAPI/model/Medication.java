package com.api.MedTrackAPI.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "medications")
public class Medication {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "medication_id")
    private Long medicationId;
@Column(name = "name", nullable = false)
    private String name;
@Column(name = "quantity")
    private int quantity;

@Column(name = "expiration_date")
    private LocalDate expirationDate;

    public Medication() {
    }

    public Long getMedicationId() {
        return medicationId;
    }

    public void setMedicationId(Long medicationId) {
        this.medicationId = medicationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }
}
