import com.shaft.driver.SHAFT;
import org.testng.annotations.BeforeSuite;

public class TCbase {

    public static SHAFT.GUI.WebDriver driver;

    @BeforeSuite
    public void browsersetup(){
        driver=new  SHAFT.GUI.WebDriver();
        driver.browser().navigateToURL("http://192.168.1.60/auth/login");

    }
}
