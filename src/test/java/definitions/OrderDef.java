package definitions;

import com.api.MedTrackAPI.model.Medication;
import com.api.MedTrackAPI.model.Pharmacy;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.api.MedTrackAPI.model.Order;
import com.api.MedTrackAPI.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class OrderDef {
private Pharmacy pharmacyOne;

    private List<Order> reorderSuggestions;
    private final OrderService orderService;

    @Autowired
    public OrderDef(OrderService orderService) {
        this.orderService = orderService;
    }

    @Given("a pharmacy with low stock levels")
    public void aPharmacyWithLowStockLevels() {
        //setup pharmacy with low stock
        this.pharmacyOne = new Pharmacy();
        // associate stock levels with each pharmacy
        List<Medication> medicationInventory = new ArrayList<>();
        // add medications to the medicationInventory with low stock levels
        //example
        Medication medication1 = new Medication();
        medication1.setQuantity(10);
        medicationInventory.add(medication1);

        //set the medication inventory for the pharmacy
        pharmacyOne.setMedicationInventory(medicationInventory);


    }

    @When("I request reorder suggestions")
    public void iRequestReorderSuggestions() {
        reorderSuggestions = orderService.generateReorderSuggestions();

    }

    @Then("I should receive a list of suggested orders")
    public void iShouldReceiveAListOfSuggestedOrders() {
    }
}
