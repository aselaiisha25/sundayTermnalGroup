package seleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankAttributes {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("http://zero.webappsecurity.com/login.html");


        String actualLink=driver.findElement(By.partialLinkText("Forgot")).getAttribute("href");
        String expectedInLInk="/forgot-password.html";

        if(actualLink.contains(expectedInLInk)) {
            System.out.println("passed");
        } else {
            System.out.println("failed");
        }




    }


}
