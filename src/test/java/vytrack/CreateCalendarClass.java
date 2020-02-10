package vytrack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.VytrackUtilities;

public class CreateCalendarClass {
    public static void main(String[] args) {
        WebDriver driver;
        String createCalendarBtnCSS="a[title='Create Calendar event']";

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa2.vytrack.com/user/login");

        VytrackUtilities.login(driver,"storemanager85","UserUser123");
         VytrackUtilities.navigateToModule(driver,"Activities","Calendar Events");

         if(driver.findElement(By.cssSelector(createCalendarBtnCSS)).isDisplayed()) {
             System.out.println("Test 2 is pass");
         }else {
             System.out.println("test 2 is failed");
         }







    }



}
