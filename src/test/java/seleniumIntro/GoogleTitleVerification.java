package seleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTitleVerification {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
//        to open a browser
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
//        driver get to google .com
        driver.get("https://www.google.com");

        driver.findElement(By.linkText("Store")).click();


        String expectedTitle="Google";
        String actualTitle=driver.getTitle();


        if(actualTitle.equals(expectedTitle)) {
            System.out.println("google title verification pass");}

        else {
            System.out.println("google title verification is failed");}

//        if(driver.getTitle().equals("Google")){
//            System.out.println("PASSED");
//        }else{
//            System.out.println("FAILED");
//        }

        }









    }


