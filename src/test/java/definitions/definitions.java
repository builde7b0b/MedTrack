package definitions;

import com.api.MedTrackAPI.InventoryManagementSystem;
import com.api.MedTrackAPI.MedTrackApiApplication;
import com.api.MedTrackAPI.model.Medication;
import com.api.MedTrackAPI.model.Pharmacy;
import com.api.MedTrackAPI.repository.PharmacyRepository;
import com.api.MedTrackAPI.service.InventoryManagementSystemService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = MedTrackApiApplication.class)

public class definitions {
    private Medication medication;
    @Autowired
    private PharmacyRepository pharmacyRepository;

    @Autowired
    private InventoryManagementSystemService inventoryManagementSystemService;



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
        System.out.println("Accessing the inventory management system");

    }

    @Then("I should be able to view the current inventory levels")
    public void iShouldBeAbleToViewTheCurrentInventoryLevels() {
        Medication medication = new Medication();

        List<Medication> inventory = inventoryManagementSystemService.getCurrentInventory();

        Assert.assertNotNull(inventory);
        Assert.assertFalse(inventory.isEmpty());
    }

    @When("the inventory management system detects low stock for a medication")
    public void theInventoryManagementSystemDetectsLowStockForAMedication() {
        int threshold = 10;
//        if (medication.getQuantity() < threshold) {
//            sendLowStockAlert(medication)
//
//        }
    }

    @Then("I should receive an automated alert notification")
    public void iShouldReceiveAnAutomatedAlertNotification() {
    }

    @When("the inventory management system detects medications approaching their expiration dates")
    public void theInventoryManagementSystemDetectsMedicationsApproachingTheirExpirationDates() {
    }
}
