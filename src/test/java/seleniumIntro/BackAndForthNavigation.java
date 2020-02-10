package seleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackAndForthNavigation {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        driver.findElement(By.linkText("Gmail")).click();

        driver.navigate().back();

        String expectedTitle="Google";
        String actualTitle=driver.getTitle();


        if(actualTitle.contains(expectedTitle)) {
            System.out.println("pass"); }
        else{
            System.out.println("failed");
        }

        driver.navigate().forward();

        String expectedTitle1="Gmail";
        String actualTitle2=driver.getTitle();


        if(actualTitle.contains(expectedTitle)) {
            System.out.println("pass again");}
        else {
            System.out.println("failed  again");
        }





    }



}
