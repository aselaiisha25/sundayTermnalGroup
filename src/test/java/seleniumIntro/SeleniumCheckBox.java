package seleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCheckBox {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");


        WebElement successCHeckBox=driver.findElement(By.xpath("//div[@id='txtAge']"));

        if(!successCHeckBox.isDisplayed()) {
            System.out.println("success message is not displayed.verification passed");
        } else {
            System.out.println("success message is displayed.verification failed");
        }

        WebElement  CheckBox=driver.findElement(By.xpath("//div[@id='txtAge']"));


        if(successCHeckBox.isDisplayed()){
            System.out.println("Success message is  displayed. Verification PASSED!");
        }else{
            System.out.println("Success message is NOT displayed. Verification FAILED!!!");
        }
    }
}



