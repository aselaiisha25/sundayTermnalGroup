package seleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankHheaderVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("http://zero.webappsecurity.com/login.html");

        String actualHeaderText=driver.findElement(By.className("page-header")).getText();

        String expectedHeaderText="Log in to ZeroBank";

        if (actualHeaderText.equals(expectedHeaderText)) {
            System.out.println("passed");}
        else {
            System.out.println("failed");
        }





    }


}
