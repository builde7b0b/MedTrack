package com.api.MedTrackAPI.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long order_id;
    @Column(name = "medication_id", nullable = false)
    private Long medication_id;
    @Column(name = "supplier_id")
    private Long supplier_id;
    @Column(name = "qty")
    private Long qty;
    @Column(name = "created_date")
    private LocalDate created_date;
    @Column(name = "price")
    private Long price;

    public Order() {
    }

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }

    public Long getMedication_id() {
        return medication_id;
    }

    public void setMedication_id(Long medication_id) {
        this.medication_id = medication_id;
    }

    public Long getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(Long supplier_id) {
        this.supplier_id = supplier_id;
    }

    public Long getQty() {
        return qty;
    }

    public void setQty(Long qty) {
        this.qty = qty;
    }

    public LocalDate getCreated_date() {
        return created_date;
    }

    public void setCreated_date(LocalDate created_date) {
        this.created_date = created_date;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
