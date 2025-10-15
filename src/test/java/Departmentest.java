import com.shaft.driver.SHAFT;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Departmentest extends Logintest {

    Department depart;
    DashboardPage dash;


    SHAFT.TestData.JSON deptetst;

    @BeforeTest

    public void Browsersetup() {
        dash = new DashboardPage(driver);
        depart = new Department(driver);
        deptetst = new SHAFT.TestData.JSON("E:\\staff\\src\\test\\resources\\departmentinfo.json");


    }


    @Test
    public void activedepartment() {
        dash.opencompanylist();
        dash.openDeprtmentpage();
        dash.adddept();
        String departname = deptetst.getTestData("departmentname");
        String assigned = deptetst.getTestData("queue");
        depart.enterdepartmentinfo(departname, assigned);


         boolean active=depart.approvedepartment(departname);
         if (active){
             System.out.println("department "+departname+ " is activated successfully");
         }
         else{
             System.out.println("departement "+departname+ " is not found");
         }

    }

    }
