package definitions;

import com.api.MedTrackAPI.model.Medication;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.LocalDate;

public class definitions {
    private Medication medication;


    @Given("I am a pharmacy manager")
    public void iAmAPharmacyManager() {
        // create Pharmacy object

    }

    @When("I access the inventory management system")
    public void iAccessTheInventoryManagementSystem() {

    }

    @Then("I should be able to view the current inventory levels")
    public void iShouldBeAbleToViewTheCurrentInventoryLevels() {
    }

    @When("the inventory management system detects low stock for a medication")
    public void theInventoryManagementSystemDetectsLowStockForAMedication() {
    }

    @Then("I should receive an automated alert notification")
    public void iShouldReceiveAnAutomatedAlertNotification() {
    }

    @When("the inventory management system detects medications approaching their expiration dates")
    public void theInventoryManagementSystemDetectsMedicationsApproachingTheirExpirationDates() {
    }
}
