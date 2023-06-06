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

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;

//UNIT TESTING
//using JUnit 5 for testing
// using Mockito for mocking dependencies

public class OrderServiceTest {
    @Mock
    private OrderRepository orderRepository;

    @InjectMocks
    private OrderService orderService;

    /**
     * initializes teh mocks using the only line inside
     */
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    /**
     * performs the unit test
     * create two mock orders
     */
    @Test
    public void testGenerateReorderSuggestions(){
        //implement unit test to verify the generation of the reorder suggestions
        //based on stock thresholds

        //create mock data to be returned by the mocked order Repo with find all
        Order order1 = new Order();
        Order order2 = new Order();
        List<Order> mockOrders = Arrays.asList(order1, order2);

        //mock behavior of orderRepository
        when(orderRepository.findAll()).thenReturn(mockOrders);


        // call the method under test and store result into variable
        List<Order> reorderSuggestions = orderService.generateReorderSuggestions();

        // assert the result and verify the list matches expected results
        Assertions.assertEquals(mockOrders, reorderSuggestions);


    }

}
