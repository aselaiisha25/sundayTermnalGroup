package seleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SelectValueFromMultyply {
    public static void main(String[] args)  throws  Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");

        Select multipleDropDown = new Select(driver.findElement(By.name("Languages")));

        List<WebElement> options= multipleDropDown.getOptions();

        for(WebElement option: options) {
            Thread.sleep(1000);
            multipleDropDown.selectByVisibleText(option.getText());
        }

     List<WebElement> selectedOptions= multipleDropDown.getAllSelectedOptions();


        for(WebElement selectedOption:selectedOptions)   {

            System.out.println(selectedOption.getText());
        }
  Thread.sleep(1000);
multipleDropDown.deselectAll();


    }
}


