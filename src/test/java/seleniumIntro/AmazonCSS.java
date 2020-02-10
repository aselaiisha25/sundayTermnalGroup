package seleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonCSS {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://amazon.com");

        WebElement amazonSearchBox = driver.findElement(By.cssSelector("input[name='field-keywords']"));
        amazonSearchBox.sendKeys("wooden spoon");
        //4. Click search button
        WebElement amazonSearchButton = driver.findElement(By.cssSelector("input[tabindex='20']"));
        amazonSearchButton.click();
        //5. Verify title contains the search term
        //USE CSS SELECTOR TO LOCATE WEBELEMENTS
        String actualTitle = driver.getTitle();
        String expectedInTitle = "wooden spoon";
        if(actualTitle.contains(expectedInTitle)){
            System.out.println("Title verification PASSED!");
        }else {
            System.out.println("Title verification FAILED!");
        }
    }
}













