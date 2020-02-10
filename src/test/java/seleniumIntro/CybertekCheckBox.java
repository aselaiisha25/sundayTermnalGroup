package seleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CybertekCheckBox {
    public static void main(String[] args) {
//        Practice:	Cybertek	Checkboxes
//    1.Go	to	http://practice.cybertekschool.com/checkboxes
//        // 2.Confirm	checkbox	#1	is	NOT	selected	by	default
//        // 3.Confirm	checkbox	#2	is	SELECTED	by	default.
//        // 4.Click	checkbox	#1	to	select	it.
//        // 5.Click	checkbox	#2	to	deselect	it.
//        // 6.Confirm	checkbox	#1	is	SELECTED.
//        // 7.Confirm	checkbox	#2	is	NOT

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/checkboxes");

       WebElement checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));

       if(!checkbox1.isSelected()) {
           System.out.println(" default checkbox1 is passed");
       } else {
           System.out.println("default  checkbox1 is failed");
       }

       WebElement checkbox2= driver.findElement(By.xpath("//input[@type='checkbox'][2]"));

       if(checkbox2.isSelected()) {
           System.out.println("checkbox2 is passed");
       } else {
           System.out.println("checkbox2 is failed");
       }













    }
}
