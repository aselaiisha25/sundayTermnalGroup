package seleniumIntro;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class SmartBearSoftwarePlacing {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");



        WebElement username=driver.findElement(By.id("ctl00_MainContent_username"));
        WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
        WebElement loginButton=driver.findElement(By.id("ctl00_MainContent_login_button"));

        username.sendKeys("Tester");
        password.sendKeys("test");
        loginButton.click();


        WebElement orderLink=driver.findElement(By.linkText("Order"));
        orderLink.click();

        WebElement dropdownProduactive=driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct"));
        Select select=new Select(dropdownProduactive);
        select.selectByVisibleText("FamilyAlbum");

        WebElement quantity=driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));

        quantity.sendKeys(Keys.BACK_SPACE);

        quantity.sendKeys("2");

        WebElement calculateButton=driver.findElement(By.xpath("//[value='Calculate]"));
        calculateButton.click();

        WebElement inputName=driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
        WebElement inputStreet=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2"));
        WebElement inputCity=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3"));
        WebElement inputState=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4"));
        WebElement inputZip=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5"));

        Faker faker=new Faker();

        inputName.sendKeys(faker.name().fullName());
        inputStreet.sendKeys(faker.address().buildingNumber());
        inputCity.sendKeys(faker.address().city());
        inputState.sendKeys(faker.address().state());
        inputZip.sendKeys(faker.address().zipCode().replaceAll("-",""));

        WebElement visaCheckbox=driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0"));
        visaCheckbox.click();

        WebElement creditCard=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
        creditCard.sendKeys(faker.finance().creditCard().replaceAll("-",""));

        WebElement inputDate=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1"));
        inputDate.sendKeys("10/25");

        WebElement processButton = driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton"));
        processButton.click();
        // 13.Verify success message “New order has been successfully added.”
        WebElement successMessage = driver.findElement(By.xpath("//div[@class='buttons_process']/strong"));
        if(successMessage.isDisplayed()){
            System.out.println("Message displayed. Order placed. PASS!");
        }else{
            System.out.println("Message is not displayed. Order NOT placed. FAIL!!!");
        }
    }
}







































