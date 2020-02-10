package seleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LinkVerificationSmartBEar {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

               WebElement username=driver.findElement(By.id("ctl00_MainContent_username"));
                WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
              WebElement loginButton=driver.findElement(By.id("ctl00_MainContent_login_button"));

              username.sendKeys("Tester");
              password.sendKeys("test");
              loginButton.click();

              List<WebElement>links= (List<WebElement>) driver.findElement(By.xpath("//body//a"));

              for(WebElement link: links){

                  System.out.println("text of link "+link.getText());
              }

        // Mini-Task:•Create a method called loginToSmartBear
        // •This method simply logs in to SmartBear when you call it

//
//
//            public static void loginToSmartBear(WebDriver driver){
//
//                WebElement inputUsername = driver.findElement(By.id("ctl00_MainContent_username"));
//                WebElement inputPassword = driver.findElement(By.id("ctl00_MainContent_password"));
//                WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
//                inputUsername.sendKeys("Tester");
//                inputPassword.sendKeys("test");
//                loginButton.click();
//
//            }

        }






    }





