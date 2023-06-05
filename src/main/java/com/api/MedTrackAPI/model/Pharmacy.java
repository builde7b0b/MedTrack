package com.api.MedTrackAPI.model;


import javax.persistence.*;


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
}
