package com.api.MedTrackAPI.service;

import com.api.MedTrackAPI.model.Order;
import com.api.MedTrackAPI.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order>  generateReorderSuggestions(){
        //implement the logic to calc stock levels, compare with thresholds,
        // and generate reorder suggestions
        //return list of orders as reorder suggestions
        return null;
    }


}
