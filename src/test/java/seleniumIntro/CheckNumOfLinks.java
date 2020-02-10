package seleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckNumOfLinks {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.openxcell.com");

        List<WebElement> links = driver.findElements(By.xpath("//body//a"));

        int expectedNum=188;
        int actualNum=links.size();

        if(expectedNum==actualNum) {
            System.out.println("links size verification is passed");
        } else {
            System.out.println("links size verification is failed");
        }
// printing out the texts of each WebElement
        int counter=0;

        for(WebElement link:links) {

            System.out.println(link.getText());
            if(link.getText().equals("")){
                counter++;
            }
        }

        int expectedNumOfLinks=109;
        int actualNumOfLinks=counter;

        if(expectedNumOfLinks==actualNumOfLinks) {
            System.out.println("links without text verification is passed");
        }else {
            System.out.println("links without text verification is failed");
        }







    }




}
