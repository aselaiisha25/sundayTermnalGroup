package testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IframePractice {
    WebDriver driver;
    @BeforeClass
    public void InframeClass(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/iframe");
    }

    @Test
    public  void test(){
        //driver.switchTo().frame(0);
        driver.switchTo().frame("mce_0_ifr");
        WebElement paragraph = driver.findElement(By.xpath("//p"));
        Assert.assertTrue(paragraph.isDisplayed());
        driver.switchTo().parentFrame();
        WebElement header = driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(header.isDisplayed());
    }
}
