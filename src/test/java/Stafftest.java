import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Stafftest extends Logintest {

    DashboardPage dash;
    Staffpage stafe;


    SHAFT.TestData.JSON test;


    By message= By.xpath("/html/body/ndc-root/ndc-layout/div/div[2]/div[1]/div/ndc-add-staff/div/div/ndc-fg-form-container/div/ndc-fg-form-generator/form/div[2]/div/ndc-fg-input[5]/span");



    @BeforeTest
    public void login() throws InterruptedException {

        dash = new DashboardPage(driver);
        test=new SHAFT.TestData.JSON("E:\\staff\\src\\test\\resources\\staffinfo.json");

    }

    @Test

    public void addstaff() throws InterruptedException {
        dash.openStafPpage();
        dash.addstaff();
        stafe=new Staffpage(driver);
        String user=test.getTestData("usertype");
        String operatingname=test.getTestData("operatingcountry");
        String branch=test.getTestData("branchname");
        String Dept=test.getTestData("Department");
        String rol=test.getTestData("role");
        String empname=test.getTestData("employeename");
        String empemail=test.getTestData("employeemail");
        String empphone=test.getTestData("employeephone");
        String username=test.getTestData("username");
        String app=test.getTestData("approval");

        stafe.selectusertype(user).selectoperatingcountry(operatingname).selectbranchname(branch).selectdepartment(Dept).selectrole(rol).setemployeename(empname).setemployemail(empemail).setemployeephone(empphone).setusername(username).selectapproval(app).sendforapprove();

        DashboardPage das=new DashboardPage(driver);
        das.addstaff();
        stafe.selectusertype(user).selectoperatingcountry(operatingname).selectbranchname(branch).selectdepartment(Dept).selectrole(rol).setemployeename(empname).setemployemail(empemail).setemployeephone(empphone).setusername(username);

        if(driver.getDriver().findElement(message).isDisplayed()){
           System.out.println("user is already exists");
        }

    }

}
