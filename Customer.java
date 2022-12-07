import common.LoanAppHelper;
import dataprovider.CustomerDataProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import pageobject.AddCustomerPage;
import pageobject.CustomersPage;
import pageobject.HomePage;

public class Customers {
    @Test(dataProvider = "CreateCustomer", dataProviderClass = CustomerDataProvider.class)
    public void AddCustomer(String branch, String branchAdmin, String branchPassword, String FirstName, String LastName, String warning) {
        //Set Gecko.driver property to interact to Firefox browser
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\staff.HPYIT06-0320\\Desktop\\Hitek\\Prep\\geckodriver-v0.31.0-win64/geckodriver.exe");
        //Create a new instance of Firefox Driver
        WebDriver driver = new FirefoxDriver();
        int numberOFMilliseconds = 5000;
        //Create Objects required for this test
        Login login = new Login();
        HomePage homePage = new HomePage(driver);
        CustomersPage customersPage = new CustomersPage(driver);
        AddCustomerPage addCustomerPage = new AddCustomerPage(driver);
        LoanAppHelper loanAppHelper = new LoanAppHelper();
        //Login to LMS - using LMSLogin method of class Login and passing 'driver' argument to the method to re-use Firefox browser already opened
        login.LMSLogin(driver, branch, branchAdmin, branchPassword);
        //Try to sleep (wait) for 5 sec (using exception handler)
        loanAppHelper.sleep(numberOFMilliseconds);
        // Click button 'Customers'
        homePage.clickCustomerButton(driver);
        //Try to sleep (wait) for 5 sec (using exception handler)
        loanAppHelper.sleep(numberOFMilliseconds);
        // Click button 'Actions'
        customersPage.clickActionButton(driver);
        // Try to sleep (wait) for 5 sec (using exception handler)
        loanAppHelper.sleep(numberOFMilliseconds);
        //Click 'Add Customer' link
        customersPage.clickAddUserLink (driver);

        //Enter 'FirstName'
        addCustomerPage.setFirstName1 (driver, FirstName) ;
        // Enter 'LastName'
        addCustomerPage.setLastName1 (driver, LastName);
        // Click button 'Save'
        addCustomerPage.clickSaveButton1 (driver);
        // Try to sleep (wait) for 5 sec (using exception handler)
        loanAppHelper.sleep(numberOFMilliseconds);
        if (warning != "") {
            loanAppHelper.doesTestExistOnPage(warning, driver);

            // Click Ok button to close the pop up
            addCustomerPage.clickOKButton(driver);
            // Click button 'Cancel'
            addCustomerPage.clickCancelButton(driver);
        } else {
            // Verify the results by parsing html page and making sure it contain just created Customer name
            loanAppHelper.doesTestExistOnPage(FirstName, driver);
        }
        // Click button 'Logout'
        customersPage.clickLogoutButton(driver);
        // Try to sleep (wait) for 5 sec (using exception handler)
        loanAppHelper.sleep(numberOFMilliseconds);
        // Close the browser
        driver.close();
    }

    @Test(dataProvider = "CreateCustomer", dataProviderClass = CustomerDataProvider.class)
    public void AddCustomer1 (String branch, String branchAdmin, String branchPassword, String FirstName, String LastName, String warning) {
        //Set Gecko.driver property to interact to Firefox browser
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\staff.HPYIT06-0320\\Desktop\\Hitek\\Prep\\geckodriver-v0.31.0-win64/geckodriver.exe");
        //Create a new instance of Firefox Driver
        WebDriver driver = new FirefoxDriver();
        int numberOFMilliseconds = 5000;
        //Create Objects required for this test
        Login login = new Login();
        HomePage homePage = new HomePage(driver);
        CustomersPage customersPage = new CustomersPage(driver);
        AddCustomerPage addCustomerPage = new AddCustomerPage(driver);
        LoanAppHelper loanAppHelper = new LoanAppHelper();
        //Login to LMS - using LMSLogin method of class Login and passing 'driver' argument to the method to re-use Firefox browser already opened
        login.LMSLogin(driver, branch, branchAdmin, branchPassword);
        //Try to sleep (wait) for 5 sec (using exception handler)
        loanAppHelper.sleep(numberOFMilliseconds);
        // Click button 'Customers'
        loanAppHelper.clickElementByID (driver, "ext-gen192");
        //Try to sleep (wait) for 5 sec (using exception handler)
        loanAppHelper.sleep(numberOFMilliseconds);
        // Click button 'Actions'
        loanAppHelper.clickElementByXPath(driver, "td[1]/table[1]/tbody[1]/tr[1]/td[2]/em[1]/button[1]");
        // Try to sleep (wait) for 5 sec (using exception handler)
        loanAppHelper.sleep(numberOFMilliseconds);
        //Click 'Add Customer' link
        loanAppHelper.clickElementByLinkName(driver, "Add Customer");
        //Enter 'FirstName'
        loanAppHelper.setText(driver, "FirstName", FirstName);
        // Enter 'LastName'
        loanAppHelper.setText(driver, "LastName", LastName);
        // Click button 'Save'
        loanAppHelper.clickElementByXPath(driver,"//div[5]/div/div/div/div[2]/div[2]/div/div[1]/div/div/div/div/div[2]/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[2]/em/button");
        // Try to sleep (wait) for 5 sec (using exception handler)
        loanAppHelper.sleep(numberOFMilliseconds);
        if (warning != "") {
            loanAppHelper.doesTestExistOnPage(warning, driver);

            // Click Ok button to close the pop up
            loanAppHelper.clickElementByXPath(driver, "//div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]");
            // Click button 'Cancel'
            loanAppHelper.clickElementByXPath(driver, "//div[5]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[2]/em[1]/button[1]");
        } else {
            // Verify the results by parsing html page and making sure it contain just created Customer name
            loanAppHelper.doesTestExistOnPage(FirstName, driver);
        }
        // Click button 'Logout'
       loanAppHelper.clickElementByXPath(driver, "//div[5]/div/div/div/div[2]/div[1]/div/div/div[1]/div/table/tbody/tr/td[5]/table/tbody/tr/td[2]/em/button");
        // Try to sleep (wait) for 5 sec (using exception handler)
        loanAppHelper.sleep(numberOFMilliseconds);
        // Close the browser
        driver.close();
    }


}
