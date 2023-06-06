package com.api.MedTrackAPI.controller;

import com.api.MedTrackAPI.model.Order;
import com.api.MedTrackAPI.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;

    }

    @GetMapping("/reorder-suggestions")
    public List<Order> getReorderSuggestions() {
        return orderService.generateReorderSuggestions();
    }

}
