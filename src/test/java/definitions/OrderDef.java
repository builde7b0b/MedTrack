package definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.api.MedTrackAPI.model.Order;
import com.api.MedTrackAPI.service.OrderService;
import java.util.List;

public class OrderDef {


    private List<Order> reorderSuggestions;
    private OrderService orderService;

    @Given("a pharmacy with low stock levels")
    public void aPharmacyWithLowStockLevels() {
        //setup pharmacy with low stock

    }

    @When("I request reorder suggestions")
    public void iRequestReorderSuggestions() {
        reorderSuggestions = orderService.generateReorderSuggestions();

    }

    @Then("I should receive a list of suggested orders")
    public void iShouldReceiveAListOfSuggestedOrders() {
    }
}
