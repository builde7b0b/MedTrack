package definitions;

import com.api.MedTrackAPI.model.Medication;
import com.api.MedTrackAPI.model.Pharmacy;
import com.api.MedTrackAPI.repository.PharmacyRepository;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

public class definitions {
    private Medication medication;
    @Autowired
    private PharmacyRepository pharmacyRepository;


    @Given("I am a pharmacy manager")
    public void iAmAPharmacyManager() {
        // create Pharmacy object
        Pharmacy pharmacy = new Pharmacy();
        pharmacy.setName("My Pharmacy");
        pharmacy.setRole("pharmacy_manager");
        pharmacyRepository.save(pharmacy);


    }

    @When("I access the inventory management system")
    public void iAccessTheInventoryManagementSystem() {
        Medication.accessSystem

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
