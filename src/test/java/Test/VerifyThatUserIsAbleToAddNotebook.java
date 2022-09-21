package Test;
import org.testng.annotations.Test;
import java.io.IOException;

public class VerifyThatUserIsAbleToAddNotebook extends BaseClass{
    @Test
    public void notebookAddToCart() throws IOException {
        pageFactory.getUserRegisteration().registeringUser();
        pageFactory.getComputer().computerNotebook();
        pageFactory.getComputer().checkout();
        pageFactory.getLogin().login();
        pageFactory.getComputer().checkout();
        pageFactory.getComputer().billingAddress();
        pageFactory.getComputer().shippingMethod();
        pageFactory.getComputer().paymentMethod();
        pageFactory.getComputer().confirmOrder();
        pageFactory.getComputer().checkoutConfirm();
    }
}

