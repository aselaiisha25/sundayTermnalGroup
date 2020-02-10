package testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WindowHandle {
    WebDriver driver;
    @BeforeClass
    public void windowHand(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/windows");
    }
    @Test
    public void title(){
        String windowHAndel=driver.getWindowHandle();

        System.out.println(windowHAndel);
//        assert tittle
        String actualTitle=driver.getTitle();
        String expectedTitle="Practice";

        Assert.assertEquals(actualTitle,expectedTitle,"not matching");

        WebElement clickHere=driver.findElement(By.linkText("Click Here"));
        clickHere.click();

        for(String handle: driver.getWindowHandles()) {

            if(!handle.equals(windowHAndel)) {
                driver.switchTo().window(handle);
            }
        }

        


    }


}
