package seleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrlVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/forgot_password");

        driver.findElement(By.name("email")).sendKeys("aselaiisha25@gmail.com"+ Keys.ENTER);

        driver.findElement(By.name("icon-2x icon-signin")).click();

        String actualURl=driver.getCurrentUrl();
        String expectedURL="email_sent";

        if(actualURl.contains(expectedURL)) {
            System.out.println("passed");
        } else {
            System.out.println("failed");
        }

       String actualTextBoxValue= driver.findElement(By.id("email_sent")).getText();
      String expectedTextBoxValue="Your e-mail's been sent!";


      if(actualTextBoxValue.equals(expectedTextBoxValue)) {
          System.out.println("passed");
      } else{
          System.out.println("failed");
      }











    }


}
