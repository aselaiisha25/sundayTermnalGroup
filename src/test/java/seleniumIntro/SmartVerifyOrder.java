package seleniumIntro;

import examplesMine.SmartBearMain;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmartVerifyOrder {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        SmartBearMain.loginToSmartBear(driver);
        //verify the givenName is in the list
        SmartBearMain.verifyOrder(driver,"another name");
    }



}


