package seleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CybertekXpath {
    public static void main(String[] args)  {



        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://practice.cybertekschool.com/add_remove_elements/");
        // 3.Click to “Add Element” button
        WebElement addElementButton = driver.findElement(By.xpath("//button[.='Add Element']"));

        addElementButton.click();
        // 4.Verify “Delete” button is displayed after clicking.
        WebElement deleteButton = driver.findElement(By.xpath("//button[.='Delete']"));
        if(deleteButton.isDisplayed()){
            System.out.println("Delete button is displayed. Verification PASSED!");
        }else{
            System.out.println("Delete button is not displayed! Verification FAILED!!!");
        }

        // 5.Click to “Delete” button.
        deleteButton.click();
        // 6.Verify “Delete” button is NOT displayed after clicking.
        try {
            WebElement deleteButtonReferenceAfterClick = driver.findElement(By.xpath("//button[.='Delete']"));
            if (deleteButtonReferenceAfterClick.isDisplayed()) {
                System.out.println("Delete button is displayed. Verification FAILED!!!");
            } else {
                System.out.println("Delete button is NOT displayed. Verification PASSED!!!");
            }
        }catch (NoSuchElementException a){
            System.out.println("Delete button is not displayed. Verification PASSED!");
        }
    }
}





