import com.shaft.driver.SHAFT;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Department extends LoginPage {

    public Department(SHAFT.GUI.WebDriver driver) {

        super(driver);
        this.driver = driver;
    }


    public By departname = By.xpath("//input[@id='id-Department']");
    public By Assignedqueu = By.xpath("//div[@class='p-multiselect-label p-placeholder']");
    public By can = By.xpath("/html/body/ndc-root/ndc-layout/div/div[2]/div[1]/div/ndc-add-department/div/div/ndc-fg-form-container/div/ndc-fg-form-generator/form/ndc-fg-input[2]/ndc-fg-dropdown-input/p-multiselect/div/p-overlay/div/div/div/div[1]/button/span");
    public By approve = By.xpath("//span[contains(text(),'Send for approval')]");
    public By inactive = By.xpath("/html/body/ndc-root/ndc-layout/div/div[2]/div[1]/div/ndc-department/div/ndc-fg-form-container/div/ndc-fg-form-generator/form/ndc-fg-input[2]/ndc-fg-radio-input/div/div/div/p-radiobutton[1]/div/div[2]");
    public By search = By.xpath("/html/body/ndc-root/ndc-layout/div/div[2]/div[1]/div/ndc-department/div/ndc-fg-form-container/div/ndc-fg-form-generator/form/div/div/button/span");
    public By depts = By.xpath("//div[@class='table-area']");
    public By remarks = By.xpath("/html/body/ndc-root/ndc-dialog-modal/p-dialog/div/div/div[3]/div/ndc-fg-form-container/div/ndc-fg-form-generator/form/ndc-fg-input/ndc-fg-text-area-input/div/textarea");
    public By approveal = By.xpath("/html/body/ndc-root/ndc-dialog-modal/p-dialog/div/div/div[3]/div/ndc-fg-form-container/div/ndc-fg-form-generator/form/div/div[2]/button/span");


    public Department enterdepartmentinfo(String deptname, String queu) {

        driver.element().type(departname, deptname);
        driver.element().select(Assignedqueu, queu);
        driver.element().waitUntilPresenceOfAllElementsLocatedBy(can);
        driver.element().click(can);
        driver.element().click(approve);
        return new Department(driver);

    }


    public boolean approvedepartment(String departmentname) {

        boolean found = false;

        String darttofind="";

        driver.element().click(inactive);
        driver.element().click(search);

        while (true) {

            List<WebElement> departments = driver.getDriver().findElements(depts);

            for (WebElement department : departments) {

                boolean fos = departments.contains(By.xpath("//td[text()='" + departmentname + "']"));

                if (fos) {
                    WebElement departname = department.findElement(By.xpath("//td[text()='" + departmentname + "']"));

                    darttofind = departname.getText();

                    if (darttofind.equalsIgnoreCase(departmentname)) {
                        WebElement activebutton =department.findElement(By.xpath("//tr[td[text()='" + departmentname + "']]//div[i[@class='pi pi-thumbs-up']]"));
                        activebutton.click();
                        driver.element().waitUntilPresenceOfAllElementsLocatedBy(remarks);
                        driver.element().type(remarks, "rero");
                        driver.element().click(approveal);
                        found = true;
                        break;
                    }
                }
            }

                if (found) {
                    break;
                }

               WebElement nextbutton=driver.getDriver().findElement(By.xpath("//i[@class='pi pi-angle-right']"));
               nextbutton.click();

              // WebElement nextebutton=driver.getDriver().findElement(By.xpath("//i[@class='pi pi-angle-right']"));
             //  nextebutton.click();


            boolean fosee = driver.getDriver().findElement(By.xpath("//td[text()='" + departmentname + "']")).isDisplayed();

             if(fosee){

                WebElement departename = driver.getDriver().findElement(By.xpath("//td[text()='" + departmentname + "']"));

                darttofind = departename.getText();

                if (darttofind.equalsIgnoreCase(departmentname)) {
                    WebElement activebutton = driver.getDriver().findElement(By.xpath("//tr[td[text()='" + departmentname + "']]//div[i[@class='pi pi-thumbs-up']]"));
                    activebutton.click();
                    driver.element().waitUntilPresenceOfAllElementsLocatedBy(remarks);
                    driver.element().type(remarks, "rero");
                    driver.element().click(approveal);
                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }


            }
                return found;

                }

            }




