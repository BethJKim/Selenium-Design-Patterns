package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Created with IntelliJ IDEA.
 * User: Beth
 * Date: 2022/Oct.07
 * Time: 9:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class LoanAppHelper {

/**
 * Search the whole page for a text string.
 * Will be slow on big pages, as it looks through the entire <body>.
 *
 * @param textToLookFor
 * @return true if found, false if not
 */
public boolean doesTestExistOnPage(String textToLookFor, WebDriver driver) {
    WebElement body = driver.findElement(By.tagName("body"));
    boolean ret = body.getText().contains(textToLookFor);
    System.out.println(ret);
    return ret;
}
    /**
     * Sleep for specified number of milliseconds
     * @param numberOFMilliseconds
     */
    public void sleep(int numberOFMilliseconds) {
        try {
            Thread.sleep(numberOFMilliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickElementByXPath(WebDriver driver, String xpath) {
        //find element
        WebElement element = driver.findElement(By.xpath(xpath));
        //click element
        element.click();
    }
    public void clickElementByLinkName(WebDriver driver, String name) {
        //find element
        WebElement element = driver.findElement(By.linkText(name));
        //click element
        element.click();
    }
    public void clickElementNyLinkName(WebDriver driver, String name) {
        // find element
        WebElement element = driver.findElement(By.linkText(name));
        //click element
        element.click();
    }
    public void clickElementByID(WebDriver driver, String id) {
        //find element
        WebElement element = driver.findElement(By.id(id));
        //click element
        element.click();
    }
    public void setText (WebDriver driver, String name, String text) {
        // find element
        WebElement element = driver.findElement(By.name(name));
        // Type text
        element.sendKeys(text);
    }
    public void selectItem (WebDriver driver, String id, String item) {
        //find element
        WebElement element = driver.findElement(By.id(id));
        // create select objet
        Select select = new Select(element);
        // Select item
        select.selectByVisibleText(item);
    }
}