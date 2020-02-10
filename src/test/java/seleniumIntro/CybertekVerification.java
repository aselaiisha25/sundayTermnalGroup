package seleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CybertekVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.cybertekschool.com");
        String expectedTitle="Cybertek";
        String actualTitle=driver.getTitle();


        if(actualTitle.equals(expectedTitle)) {
            System.out.println("Cybertek verification is passed");}
        else {
            System.out.println("failed");
        }

        String expectedInUrl="cybertekschool";
        String actualUrl=driver.getCurrentUrl();

        if(actualUrl.contains(expectedInUrl)) {


            System.out.println("url passed");}
                else {
                    System.out.println("url failed");

                }
                driver.close();
            }
        }








