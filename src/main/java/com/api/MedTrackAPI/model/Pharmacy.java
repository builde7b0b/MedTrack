package com.api.MedTrackAPI.model;


import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "pharmacy")
public class Pharmacy {
    @Id
    @GeneratedValue
    @Column(name = "supplier_id")
    private Long pharmacy_id ;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "Contact_info")
    private String address;

    @Column(name = "role")
    private String role;

    @OneToMany(mappedBy = "pharmacy", cascade = CascadeType.ALL)
    private List<Medication> medicationInventory;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }



    public Pharmacy() {
    }


    public Long getPharmacy_id() {
        return pharmacy_id;
    }

    public void setPharmacy_id(Long pharmacy_id) {
        this.pharmacy_id = pharmacy_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Medication> getMedicationInventory() {
        return medicationInventory;
    }

    public void setMedicationInventory(List<Medication> medicationInventory) {
        this.medicationInventory = medicationInventory;
    }
}
