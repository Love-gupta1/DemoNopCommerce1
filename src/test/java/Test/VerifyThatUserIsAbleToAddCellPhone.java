package Test;
import org.testng.annotations.Test;

import java.io.IOException;
public class VerifyThatUserIsAbleToAddCellPhone extends BaseClass{
    @Test
    public void addCellPhone() throws IOException {
        pageFactory.getUserRegisteration().registeringUser();
        pageFactory.electronics().electronicCell();
        pageFactory.getLogin().login();
        pageFactory.electronics().checkout();
        pageFactory.electronics().billing();
        pageFactory.getComputer().shippingMethod();
        pageFactory.getComputer().paymentMethod();
        pageFactory.getComputer().confirmOrder();
        pageFactory.getComputer().checkoutConfirm();
    }
}
