package Test;
import org.testng.annotations.Test;
import java.io.IOException;
public class UserRegistrationTest extends BaseClass {
    @Test
    public void register() throws IOException {
        pageFactory.getUserRegisteration().registeringUser();
    }
}
