package com.api.MedTrackAPI.repository;

import com.api.MedTrackAPI.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
