import com.mahmoudelgohary.ecommerce.apis.auth.RegisterApi;
import com.mahmoudelgohary.ecommerce.pojo.request.RegisterRequest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterApiTests {

    // Using ThreadLocal to ensure thread safety when running tests in parallel
    ThreadLocal<RegisterApi> registerApiThreadLocal = new ThreadLocal<>();

    @BeforeMethod
    public void setUp() {
        // Initialize the RegisterApi instance before each test method
        registerApiThreadLocal.set(new RegisterApi());
    }

    private RegisterApi getRegisterApi() {
        return registerApiThreadLocal.get();
    }

    @AfterMethod
    public void tearDown() {
        // Clean up resources or reset states after each test method if necessary
        registerApiThreadLocal.remove();
    }

    @Test
    public void validateRegisterStatusCode() {

        // Create a RegisterRequest object with the required data
        RegisterRequest registerRequest = new RegisterRequest("mahmoud7", "youssef7", "123456", "mail8@gmail.com");

        getRegisterApi().sendRegisterRequest(registerRequest)
                   .then().assertThat().statusCode(201);
    }


}
