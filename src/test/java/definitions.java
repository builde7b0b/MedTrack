import com.api.MedTrackAPI.model.Medication;
import io.cucumber.java.en.Given;

import java.time.LocalDate;

public class definitions {
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
