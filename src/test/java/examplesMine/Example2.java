package examplesMine;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Example2 {
    public static void main(String[] args) {
//        Open	browser
//        2.Go	to	website:	http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        // 3.Enter username: “Tester”
        // 3.Enter username: “Tester”
        WebElement username=driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
        // 4.Enter password: “test”
        WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");


        // 5.Click on Login button

        WebElement loginBtn=driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginBtn.click();
        // 6.Click on Order
        WebElement orderBtn=driver.findElement(By.linkText("Order"));
        orderBtn.click();
        // 7.Select familyAlbum from product, set quantity to 2
        WebElement productDropdown=driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct"));
        Select select=new Select(productDropdown);
        select.selectByVisibleText("FamilyAlbum");

        WebElement quantity=driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
        quantity.sendKeys(Keys.BACK_SPACE);
        quantity.sendKeys("2");


        // 8.Click to “Calculate”button

        WebElement calculateBtn=driver.findElement(By.xpath("//input[@value='Calculate']"));
        calculateBtn.click();
        // 9.Fill address Info with JavaFaker•Generate: name, street, city, state, zip code
        WebElement name=driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
        WebElement street=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2"));
        WebElement city=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3"));
        WebElement state=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4"));
        WebElement zip=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5"));

        Faker faker=new Faker();
        name.sendKeys(faker.name().fullName());
        street.sendKeys(faker.address().streetAddress());
        city.sendKeys(faker.address().city());
        state.sendKeys(faker.address().state());
        zip.sendKeys(faker.address().zipCode().replaceAll("-",""));


        // 10.Click on “visa” radio button
        WebElement visa=driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0"));
        visa.click();
        // 11.Generate card number using JavaFaker
        WebElement cardNumber=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
        cardNumber.sendKeys(faker.finance().creditCard().replaceAll("-",""));

        WebElement dateCardNum=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1"));
        dateCardNum.sendKeys("10/25");
        // 12.Click on “Process”
        WebElement processbtn=driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton"));
        processbtn.click();
        // 13.Verify success message “New order has been successfully added
        WebElement successMessage = driver.findElement(By.xpath("//div[@class='buttons_process']/strong"));
        if(successMessage.isDisplayed()){
            System.out.println("Message displayed. Order placed. PASS!");
        }else{
            System.out.println("Message is not displayed. Order NOT placed. FAIL!!!");
        }

        driver.findElement(By.linkText("View all orders")).click();


    }



    }




