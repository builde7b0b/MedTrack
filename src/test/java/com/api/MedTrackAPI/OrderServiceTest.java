package com.api.MedTrackAPI;

import com.api.MedTrackAPI.model.Medication;
import com.api.MedTrackAPI.model.Order;
import com.api.MedTrackAPI.model.Pharmacy;
import com.api.MedTrackAPI.repository.MedicationRepository;
import com.api.MedTrackAPI.repository.OrderRepository;
import com.api.MedTrackAPI.service.OrderService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;

//UNIT TESTING
//using JUnit 5 for testing
// using Mockito for mocking dependencies

public class OrderServiceTest {
    @Mock
    private OrderRepository orderRepository;

    @Mock
    private MedicationRepository medicationRepository;

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
//    @Test
//    public void testGenerateReorderSuggestions() {
//        // Create mock data for medications
//        Medication medication1 = new Medication(1L, "Medication 1", 3, LocalDate.of(2023, 6, 1), new Pharmacy());
//        Medication medication2 = new Medication(2L, "Medication 2", 12, LocalDate.of(2023, 6, 1), new Pharmacy());
//        Medication medication3 = new Medication(3L, "Medication 3", 4, LocalDate.of(2023, 6, 1), new Pharmacy());
//
//        // Create mock orders
//        Order order1 = new Order();
//        Order order2 = new Order();
//
//        // Create mock list of orders
//        List<Order> mockOrders = Arrays.asList(order1, order2);
//
//        // Set the threshold value to 5
//        int threshold = 5;
//
//        // Mock the behavior of medicationRepository
//        when(medicationRepository.findAll()).thenReturn(Arrays.asList(medication1, medication2, medication3));
//
//        // Mock the behavior of orderRepository
//        when(orderRepository.findAll()).thenReturn(mockOrders);
//
//        // Call the method under test and store the result in a variable
//        List<Order> reorderSuggestions = orderService.generateReorderSuggestions();
//
//        // Create a new list to hold the expected reorder suggestions
//        List<Order> expectedSuggestions = Arrays.asList(order1, order2); // Adjust based on your expected suggestions
//
//        // Assert the result
//        Assertions.assertEquals(expectedSuggestions.size(), reorderSuggestions.size());
//        for (int i = 0; i < expectedSuggestions.size(); i++) {
//            Order expectedOrder = new Order();
//            Order actualOrder = reorderSuggestions.get(i);
//            Assertions.assertEquals(expectedOrder.getMedication_id(), actualOrder.getMedication_id());
//            // Compare other attributes as needed
        //}
    }




