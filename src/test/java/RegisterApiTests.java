import com.mahmoudelgohary.ecommerce.apis.auth.RegisterApi;
import com.mahmoudelgohary.ecommerce.pojo.request.RegisterRequest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterApiTests {

    RegisterApi registerApi;

    @BeforeMethod
    public void setUp() {
        // Initialize the RegisterApi instance before each test method
        registerApi = new RegisterApi();
    }

    @AfterMethod
    public void tearDown() {
        // Clean up resources or reset states after each test method if necessary
        registerApi = null;
    }

    @Test
    public void validateRegisterStatusCode() {

        // Create a RegisterRequest object with the required data
        RegisterRequest registerRequest = new RegisterRequest("mahmoud7", "youssef7", "123456", "mail8@gmail.com");

        registerApi.sendRegisterRequest(registerRequest)
                   .then().assertThat().statusCode(201);
    }


}
