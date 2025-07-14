import org.openqa.selenium.By;
import com.shaft.driver.SHAFT;

public class Staffpage extends LoginPage{


    public Staffpage(SHAFT.GUI.WebDriver driver){
        super(driver);
        this.driver = driver;
    }

      By usertype=By.xpath("/html/body/ndc-root/ndc-layout/div/div[2]/div[1]/div/ndc-add-staff/div/div/ndc-fg-form-container/div/ndc-fg-form-generator/form/div[1]/div/ndc-fg-input[1]/ndc-fg-dropdown-input/p-dropdown/div/span");
      By operatingcountry=By.xpath("/html/body/ndc-root/ndc-layout/div/div[2]/div[1]/div/ndc-add-staff/div/div/ndc-fg-form-container/div/ndc-fg-form-generator/form/div[1]/div/ndc-fg-input[2]/ndc-fg-dropdown-input/p-multiselect/div/div[2]/div");
      By Branchname=By.xpath("/html/body/ndc-root/ndc-layout/div/div[2]/div[1]/div/ndc-add-staff/div/div/ndc-fg-form-container/div/ndc-fg-form-generator/form/div[1]/div/ndc-fg-input[3]/ndc-fg-dropdown-input/p-multiselect/div/div[2]/div");
      By department=By.xpath("/html/body/ndc-root/ndc-layout/div/div[2]/div[1]/div/ndc-add-staff/div/div/ndc-fg-form-container/div/ndc-fg-form-generator/form/div[1]/div/ndc-fg-input[4]/ndc-fg-dropdown-input/p-multiselect/div/div[2]/div");
      By role=By.xpath("/html/body/ndc-root/ndc-layout/div/div[2]/div[1]/div/ndc-add-staff/div/div/ndc-fg-form-container/div/ndc-fg-form-generator/form/div[1]/div/ndc-fg-input[5]/ndc-fg-dropdown-input/p-multiselect/div/div[2]/div");
      By employee=By.id("id-Employeename");
      By employeeemail=By.id("id-Employeeemail");
      By employeephone=By.id("Employee phone number");
      By username=By.id("id-Username");
      By approval=By.xpath("/html/body/ndc-root/ndc-layout/div/div[2]/div[1]/div/ndc-add-staff/div/div/ndc-fg-form-container/div/ndc-fg-form-generator/form/div[2]/div/ndc-fg-input[6]/ndc-fg-dropdown-input/p-dropdown/div/span");
      By sendforapproval=By.xpath("//span[contains(text(),'Send for Approval')]");



    public Staffpage selectusertype(String user){

        driver.element().select(usertype,user);

        return new Staffpage(driver);
    }

    public Staffpage selectoperatingcountry(String operating){
        driver.element().select(operatingcountry,operating);
        return new Staffpage(driver);
    }

    public Staffpage selectbranchname(String branch){
        driver.element().select(Branchname,branch);
        return new Staffpage(driver);
    }

    public Staffpage selectdepartment(String departmentname){
        driver.element().select(department,departmentname);
        return new Staffpage(driver);

    }

    public Staffpage selectrole(String rolename){
        driver.element().select(role,rolename);
        return new Staffpage(driver);

    }

    public Staffpage setemployeename(String empname){
        driver.element().type(employee,empname);
        return new Staffpage(driver);

    }

    public Staffpage setemployemail(String empmail){
        driver.element().type(employeeemail,empmail);
        return new Staffpage(driver);

    }

    public Staffpage setemployeephone(String empphone){
        driver.element().type(employeephone,empphone);
        return new Staffpage(driver);

    }

    public Staffpage setusername(String user){
        driver.element().type(username,user);
        return new Staffpage(driver);

    }

    public Staffpage selectapproval(String approv){
        driver.element().select(approval,approv);
        return new Staffpage(driver);

    }


    public Staffpage sendforapprove(){
        driver.element().click(sendforapproval);
        return new Staffpage(driver);

    }

}


