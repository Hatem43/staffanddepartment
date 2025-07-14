import org.testng.annotations.BeforeTest;


public class Logintest extends TCbase{


    LoginPage login;


    @BeforeTest
    public void loginvalid() throws InterruptedException {
        login=new LoginPage(driver);
        login.LoginWithValidData(login.ValidUser, login.ValidPass);

    }

}
