package definitions;

import com.api.MedTrackAPI.MedTrackApiApplication;
import com.api.MedTrackAPI.model.Medication;
import io.cucumber.java.en.Given;
import io.cucumber.spring.CucumberContextConfiguration;
import io.restassured.response.Response;
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
}
