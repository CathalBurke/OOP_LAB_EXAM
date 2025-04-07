import ie.atu.Patient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PatientInfoTest {

    private Patient Patient;

    @BeforeEach
    public void setup (){

        Patient = new Patient();

    }
    @Test
    public void Test_Given_name(){
        Patient  = Patient.getGiven_name("John");
        assert true("John");

    }



}
