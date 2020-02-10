package seleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthenticBank {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("http://zero.webappsecurity.com/login.html");

        driver.findElement(By.id("user_login")).sendKeys("username");

        driver.findElement(By.id("user_password")).sendKeys("password");

        driver.findElement(By.name("submit")).click();

        if(driver.findElement(By.linkText("username")).isDisplayed()){
            System.out.println("Username verification is PASSED!");
            System.out.println("Username is displayed on the page.");
        }else{
            System.out.println("Username verification is FAILED!");
            System.out.println("Username is not displayed on the page.");
        }
        // 7.Verify the title Zero – Account Summary
        String actualTitle = driver.getTitle();
        String expectedTitle = "Zero - Account Summary";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else {
            System.out.println("Title verification FAILED!");
        }
        // 8.Verify the link Account Summary’s href value contains: “account-summary”
        String actualLinkValue = driver.findElement(By.linkText("Account Summary")).getAttribute("href");
        String expectedInLink = "account-summary";
        if(actualLinkValue.contains(expectedInLink)){
            System.out.println("Link verification PASSED!");
        }else{
            System.out.println("Link verification FAILED!");
        }
        // Print out results in validation formats
    }
}






























//        AIISHA MURAT
//ALI MURAT