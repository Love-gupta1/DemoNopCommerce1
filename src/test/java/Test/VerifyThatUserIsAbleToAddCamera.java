package Test;
import org.testng.annotations.Test;

import java.io.IOException;
public class VerifyThatUserIsAbleToAddCamera extends BaseClass {
    @Test
    public void addCamera() throws IOException {
        pageFactory.getUserRegisteration().registeringUser();
        pageFactory.electronics().addCamera();
        pageFactory.getLogin().login();
        pageFactory.electronics().checkout();
        pageFactory.electronics().billing();
        pageFactory.getComputer().shippingMethod();
        pageFactory.getComputer().paymentMethod();
        pageFactory.getComputer().confirmOrder();
        pageFactory.getComputer().checkoutConfirm();
    }
}
