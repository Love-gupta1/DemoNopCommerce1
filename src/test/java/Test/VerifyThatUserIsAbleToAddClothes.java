package Test;
import org.testng.annotations.Test;

import java.io.IOException;
public class VerifyThatUserIsAbleToAddClothes extends BaseClass {
    @Test
    public void addClothes() throws IOException {
        pageFactory.getUserRegisteration().registeringUser();
        pageFactory.getApparel().addClothes();
        pageFactory.getLogin().login();
        pageFactory.getElectronics().checkout();
        pageFactory.getElectronics().billing();
        pageFactory.getComputer().shippingMethod();
        pageFactory.getComputer().paymentMethod();
        pageFactory.getComputer().confirmOrder();
        pageFactory.getComputer().checkoutConfirm();
    }
}
