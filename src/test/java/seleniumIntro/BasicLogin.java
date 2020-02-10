package seleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLogin {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        String actualTitle=driver.getTitle();
        String expectedInTitle="Web Orders Login";

        if(actualTitle.equals(expectedInTitle)) {
            System.out.println("Login page title verification is passed");}

        else {
            System.out.println("Login page title verification is failed");
        }


        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");

        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");

        driver.findElement(By.name("ctl00$MainContent$login_button")).click();

        String expectedLoginTitle="Web Orders";
        String actualLoginTitle=driver.getTitle();

        if(actualLoginTitle.equals(expectedLoginTitle)) {
            System.out.println("Landing page title verification is passed"); }
            else {
            System.out.println("Landing page is title verification is failed");

        }













    }




}
