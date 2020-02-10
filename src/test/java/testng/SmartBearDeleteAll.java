package testng;

import examplesMine.SmartBearMain;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartBearDeleteAll {
    WebDriver driver;
   @BeforeMethod
    public void setup(){
       WebDriverManager.chromedriver().setup();
       driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
   }

   @Test
    public void deletAllTest() throws InterruptedException{
       SmartBearMain.loginToSmartBear(driver);
       WebElement checkAll=driver.findElement(By.id("ctl00_MainContent_btnCheckAll"));
       checkAll.click();

       List<WebElement> checkBoxes=driver.findElements(By.xpath("//table[@id=‘ctl00_MainContent_orderGrid’]/tbody/tr/td[1]"));

       for(WebElement checkbox:checkBoxes) {
           Thread.sleep(2000);
           Assert.assertTrue(checkbox.isSelected());}

           WebElement deleteBtn=driver.findElement(By.id("ctl00_MainContent_btnDelete"));
           deleteBtn.click();

           WebElement emptyOrderListMessage=driver.findElement(By.id("ctl00_MainContent_orderMessage"));

           Assert.assertTrue(emptyOrderListMessage.isDisplayed(),"empty order list message is not displayed");



   }

   }





