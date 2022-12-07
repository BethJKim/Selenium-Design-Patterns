// CustomerPage

package pageobject;

import common.LoanAppHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CustomersPage {
    // this sis a constructor
    public CustomersPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // Locators
    // button 'Actions'
    @FindBy(how = How.XPATH, using = "//td[1]/table[1]/tbody[1]/tr[1]/td[2]/em[1]/button[1]")
    private WebElement buttonActions;
    //link 'Add Customers'
    @FindBy(how = How.LINK_TEXT, using = "Add Customer")
    private WebElement linkAddUser;
    //link 'Edit User'
    @FindBy(how = How.LINK_TEXT, using = "Edit Customer")
    private WebElement linkEditUser;
    //link 'Delete User'
    @FindBy(how = How.LINK_TEXT, using = "Delete Customer")
    private WebElement linkDeleteUser;
    //button 'Logout'
    @FindBy(how = How.XPATH, using = "//div[5]/div/div/div/div[2]/div[1]/div/div/div[1]/div/table/tbody/tr/td[5]/table/tbody/tr/td[2]/em/button")
    private WebElement buttonLogout;

    // Methods
    public CustomersPage clickActionButton(WebDriver driver) {
        //click Users button
        buttonActions.click();
        return this;
    }

    public CustomersPage clickAddUserLink(WebDriver driver) {
        //click Add User link
        linkAddUser.click();
        return this;
    }

    public CustomersPage clickDeleteUserLink(WebDriver driver) {
        //click Delete User link
        linkDeleteUser.click();
        return this;
    }

    public CustomersPage clickLogoutButton(WebDriver driver) {
        // click Logout button
        buttonLogout.click();
        return this;
    }
    // Methods Bot Style
    LoanAppHelper loanAppHelper = new LoanAppHelper();

    public CustomersPage clickActionButton1(WebDriver driver) {
        //click Actions button
        loanAppHelper.clickElementByXPath(driver, "//td[1]/table[1]/tbody[1]/tr[1]/td[2]/em[1]/button[1]");
        return this;
    }
        public CustomersPage clickAddCustomerLink1 (WebDriver driver){
            //click Add User link
            loanAppHelper.clickElementByLinkName(driver, "Add Customer");
            return this;
        }
        public CustomersPage clickEditCustomerLink1 (WebDriver driver){
            //click Delete User link
            loanAppHelper.clickElementByLinkName(driver, "Edit Customer");
            return this;
        }
        public CustomersPage clickDeleteCustomerLink1 (WebDriver driver){
            //click Delete User link
            loanAppHelper.clickElementByLinkName(driver, "Delete Customer");
            return this;
        }
        public CustomersPage clickLogoutButton1 (WebDriver driver){
            // click Logout button
            loanAppHelper.clickElementByXPath(driver, "//div[5]/div/div/div/div[2]/div[1]/div/div/div[1]/div/table/tbody/tr/td[5]/table/tbody/tr/td[2]/em/button");
            return this;
        }
    }


// AddCustomerPage
package pageobject;

import common.LoanAppHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
    // this is a constructor
    public AddCustomerPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // Locators
    // text field 'FirstName'
    @FindBy(how = How.NAME, using = "FirstName")
    private WebElement firstName;

    // text field 'LastName'
    @FindBy(how = How.NAME, using = "LastName")
    private WebElement lastName;

    // button 'Save'
    @FindBy(how = How.XPATH, using = "//div[5]/div/div/div/div[2]/div[2]/div/div[1]/div/div/div/div/div[2]/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[2]/em/button")
    private WebElement buttonSave;

    // button 'Cancel'
    @FindBy(how = How.XPATH, using = "//div[5]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[2]/em[1]/button[1]")
    private WebElement buttonCancel;

    // button 'ok' to close warning message
    @FindBy(how = How.XPATH, using = "//div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]")
    private WebElement buttonOK;

    // Methods
    public AddCustomerPage setFirstName(WebDriver driver, String firstname) {
        // Enter FirstName
        firstName.sendKeys(firstname);
        return this;
    }

    public AddCustomerPage setLastName(WebDriver driver, String lastname) {
        // Enter LastName
        lastName.sendKeys(lastname);
        return this;
    }

    public AddCustomerPage clickSaveButton(WebDriver driver) {
        // Click Save button
        buttonSave.click();
        return this;
    }

    public AddCustomerPage clickCancelButton(WebDriver driver) {
        // Click Cancel button
        buttonCancel.click();
        return this;
    }

    public AddCustomerPage clickOKButton(WebDriver driver) {
        // Click OK button on warning message pop up
        buttonOK.click();
        return this;
    }


    //Method - Bot Style
    LoanAppHelper loanAppHelper = new LoanAppHelper();
    public AddCustomerPage setFirstName1 (WebDriver driver, String firstname) {
        // Enter username
        loanAppHelper.setText (driver, "FirstName", firstname);
        return this;
    }
    public AddCustomerPage setLastName1(WebDriver driver, String lastname) {
        // Enter LastName
        lastName.sendKeys(lastname);
        return this;
    }

    public AddCustomerPage clickSaveButton1 (WebDriver driver) {
        // Click Save button
        buttonSave.click();
        return this;
    }

    public AddCustomerPage clickCancelButton1 (WebDriver driver) {
        // Click Cancel button
        buttonCancel.click();
        return this;
    }

    public AddCustomerPage clickOKButton1 (WebDriver driver) {
        // Click OK button on warning message pop up
        buttonOK.click();
        return this;
    }
}