package com.api.MedTrackAPI.model;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "medications")
public class Medication {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "medication_id")
    private Long medication_Id;
@Column(name = "name", nullable = false)
    private String name;
@Column(name = "quantity")
    private int quantity;

@Column(name = "expiration_date")
    private LocalDate expirationDate;

    @ManyToOne
    private Pharmacy pharmacy;

    public Medication() {
    }

    public Long getMedication_Id() {
        return medication_Id;
    }

    public void setMedication_Id(Long medication_Id) {
        this.medication_Id = medication_Id;
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
