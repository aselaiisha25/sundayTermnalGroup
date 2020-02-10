package testng;

import org.testng.Assert;
import org.testng.annotations.*;

public class FirstTestng {
//    public static void main(String[] args) {
//
//    }
    @BeforeClass
    public void Setup(){
        System.out.println("Before class is running...");

    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before method is running...");

    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("after method is running...");
    }
    @AfterClass
    public void tearDown(){
        System.out.println("AfterClass is running...");
    }
    @Test
    public  void bFistTest(){
        System.out.println("first test is running...");
        Assert.assertEquals("actual value","actual value ","first test is failed");
        Assert.assertEquals(1,1,"first test is failed");





    }
    @Test
    public void aSecondTest(){
        System.out.println("second test is running...");
        String letter="b";
        Assert.assertTrue("senyence".contains(letter),"message not contain: "+letter);
    }


}
