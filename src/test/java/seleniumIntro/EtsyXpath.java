package seleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtsyXpath {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://etsy.com");

        WebElement etsySearchBox = driver.findElement(By.xpath("//input[@name='search_query']"));
        //WebElement manageInterestCollectionOnTheLeft
        etsySearchBox.sendKeys("wooden spoon");
        //4. Click search button
        WebElement etsySearchButton = driver.findElement(By.xpath("//button[@value='Search']"));
        etsySearchButton.click();
        //5. Verify title contains the search term
        //USE XPATH TO LOCATORS TO LOCATE WEBELEMENTS
        String actualTitle = driver.getTitle();
        String expectedInTitle = "Wooden spoon";
        if (actualTitle.contains(expectedInTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!");
        }
    }
}





    