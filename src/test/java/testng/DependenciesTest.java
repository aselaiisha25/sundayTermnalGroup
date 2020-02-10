package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependenciesTest {


    @Test
    public void login(){
        System.out.println("Logging in...");
    }

    @Test (dependsOnMethods = "login")
    public  void makePurchase(){
        System.out.println("making a purchase");
        Assert.fail("on purpose fail");
    }

    @Test
    public  void homePage(){
        System.out.println("homepage is tested");


    }
}
