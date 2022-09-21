package Test;
import org.testng.annotations.Test;

import java.io.IOException;
public class VerifyThatUserIsAbleToAddAnyShoes extends BaseClass {
    @Test
    public void addShoesInCart() throws IOException {
        pageFactory.getUserRegisteration().registeringUser();
        pageFactory.getApparel().addShoes();
        pageFactory.getLogin().login();
        pageFactory.getElectronics().checkout();
        pageFactory.getElectronics().billing();
        pageFactory.getComputer().shippingMethod();
        pageFactory.getComputer().paymentMethod();
        pageFactory.getComputer().confirmOrder();
        pageFactory.getComputer().checkoutConfirm();
    }
}
