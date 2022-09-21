package Page;
import org.openqa.selenium.WebDriver;
public class PageFactory {
    static WebDriver driver;
    private UserRegistration userRegisteration;
    private Computer computer;
    private Login login;
    public PageFactory(WebDriver driver) {
        this.driver = driver;
    }

    public UserRegistration getUserRegisteration() {
        if (userRegisteration == null) {
            userRegisteration = new UserRegistration(driver);
        }
        return userRegisteration;
    }
    public Computer getComputer() {
        if(computer == null) {
            computer = new Computer(driver);
        }
        return computer;
    }

    public Login getLogin() {
        if (login == null) {
            login = new Login(driver);
        }
        return  login;
    }
}