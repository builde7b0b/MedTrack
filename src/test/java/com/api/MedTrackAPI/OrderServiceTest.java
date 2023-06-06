package com.api.MedTrackAPI;

import com.api.MedTrackAPI.repository.OrderRepository;
import com.api.MedTrackAPI.service.OrderService
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

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

    public void testGenerateReorderSuggestions(){
        //implement unit test to verify the generation of the reorder suggestions
        //based on stock thresholds

    }

}
