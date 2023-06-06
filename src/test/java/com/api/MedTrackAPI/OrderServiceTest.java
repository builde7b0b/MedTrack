package com.api.MedTrackAPI;

import com.api.MedTrackAPI.model.Order;
import com.api.MedTrackAPI.repository.OrderRepository;
import com.api.MedTrackAPI.service.OrderService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.mockito.Mockito.when;

//UNIT TESTING
public class OrderServiceTest {
    @Mock
    private OrderRepository orderRepository;

    @InjectMocks
    private OrderService orderService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGenerateReorderSuggestions(){
        //implement unit test to verify the generation of the reorder suggestions
        //based on stock thresholds

        //create mock data
        Order order1 = new Order();
        Order order2 = new Order();
        List<Order> mockOrders = List.of(order1, order2);

        //mock behavior of orderRepository
        when(orderRepository.findAll()).thenReturn(mockOrders);


        // call the method under test
        List<Order> reorderSuggestions = orderService.generateReorderSuggestions();

        // assert the result
        Assertions.assertEquals(mockOrders, reorderSuggestions);


    }

}
