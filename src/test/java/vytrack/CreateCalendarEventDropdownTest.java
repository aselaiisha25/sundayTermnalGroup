package vytrack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.SeleniumUtils;
import utilities.VytrackUtilities;

public class CreateCalendarEventDropdownTest {
    public static void main(String[] args) {
        WebDriver driver;
        String createCalendarBtnCSS="a[title='Create Calendar event']";
        String saveCloseBtnXpath="//div/button[contains(text(), 'Save and Close')] ";
        String dropDownXpath="//a[@class='btn-success btn dropdown-toggle']";

        String saveAndCloseOptionLocatorXpath = "//li/button[contains(text(), 'Save and Close')]";
        String saveAndNewOptionLocatorXpath = "//li/button[contains(text(), 'Save and New')]";
        String saveOptionLocatorXpath = "(//li/button[contains(text(), 'Save')])[3]";

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa2.vytrack.com/user/login");

        VytrackUtilities.login(driver,"storemanager85","UserUser123");
        VytrackUtilities.navigateToModule(driver,"Activities","Calendar Events");

        driver.findElement(By.cssSelector(createCalendarBtnCSS)).click();

        SeleniumUtils.pause(3);
        // Step 5
        if(driver.findElement(By.xpath(saveAndCloseOptionLocatorXpath)).isDisplayed()) {
            System.out.println("Save and Close btn - Pass");
        } else {
            System.out.println("Save and Close btn - Fail");
        }
        // Step 6

        driver.findElement(By.xpath(dropDownXpath)).click();
        SeleniumUtils.pause(1);
        if(driver.findElement(By.xpath(saveAndCloseOptionLocatorXpath)).isDisplayed()) {
            System.out.println("Save and Close option - Pass");
        } else {
            System.out.println("Save and Close option - Fail");
        }

        // Step-verify all options
        if(driver.findElement(By.xpath(saveAndNewOptionLocatorXpath)).isDisplayed()) {
            System.out.println("Save and New option - Pass");
        } else {
            System.out.println("Save and New option - Fail");
        }
        if(driver.findElement(By.xpath(saveOptionLocatorXpath)).isDisplayed()) {
            System.out.println("Save option - Pass");
        } else {
            System.out.println("Save option - Fail");
        }
    }




















}




