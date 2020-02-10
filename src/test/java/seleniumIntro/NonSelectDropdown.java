package seleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class NonSelectDropdown {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement dropDownLink = driver.findElement(By.id("dropdownMenuLink"));
        dropDownLink.click();

        WebElement facebookLink=driver.findElement(By.xpath("//a[.='Facebook']"));
        facebookLink.click();
        Thread.sleep(1000);

        String expectedTitle="Facebook-Log In or Sign up";
        String actualTitle=driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("Title verification passed!");
        }else{
            System.out.println("Title verification failed!!!");
        }
    }
}








