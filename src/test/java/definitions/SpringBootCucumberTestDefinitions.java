package definitions;

import com.api.MedTrackAPI.MedTrackApiApplication;
import com.api.MedTrackAPI.model.Medication;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

import java.time.LocalDate;

@CucumberContextConfiguration
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = MedTrackApiApplication.class)

public class SpringBootCucumberTestDefinitions {

    private static final String BASE_URL = "http://localhost:";



    @LocalServerPort
    String port;

    private static Response response;

    private Medication medication;
    @Given("I have a valid medication payload")
    public void iHaveAValidMedicationPayload() {
        //create a valid medication object with specific values
        medication = new Medication();
        medication.setName("Apirin");
        medication.setQuantity(100);
        medication.setExpirationDate(LocalDate.of(2023, 5, 31));

    }

    @When("I send a POST request to {string}")
    public void iSendAPOSTRequestTo(String endpoint) {
        // setup the request URL
        String url = BASE_URL + port + endpoint;

        // Send the POST request with the medication payload
        response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(medication)
                .post(url);

    }

    @Then("the response status code should be {int}")
    public void theResponseStatusCodeShouldBe(int statusCode) {
        // assert the response status code
        Assert.assertEquals(statusCode, response.getStatusCode());
    }

    @And("the response should contain the created medication detail")
    public void theResponseShouldContainTheCreatedMedicationDetail() {
    }
}
