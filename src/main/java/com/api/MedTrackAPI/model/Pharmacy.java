package com.api.MedTrackAPI.model;

import jakarta.persistence.*;
import jdk.jfr.Enabled;

@Entity
@Table(name = "pharmacy")
public class Pharmacy {
    @Id
    @GeneratedValue
    @Column(name = "supplier_id")
    private Long pharmacy_id ;
    private String name;
    private String email;
    private String password;
    private String address;


}
