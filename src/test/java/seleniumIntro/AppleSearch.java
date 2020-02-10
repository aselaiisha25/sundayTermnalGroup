package seleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppleSearch {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

//        driver.findElement(By.name("q")).sendKeys("apple");
        driver.findElement(By.name("q")).sendKeys("apple"+ Keys.ENTER);

        driver.findElement(By.name("btnK")).click();

        String actualTitle=driver.getTitle();
        String expectedInTitle="apple";

        if(actualTitle.startsWith("apple")) {
            System.out.println("Apple search title verification  is passed");}
        else {
            System.out.println("apple search title verification is failed");
        }









    }


}
