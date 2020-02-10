package testng;

import org.testng.annotations.Test;

public class OrderOfThings {
    @Test
    public void firstTest(){
        System.out.println("test one is running");


    }
    @Test(priority = 4)
    public void secondTest(){
        System.out.println("test 2 is running");

    }
    @Test (priority = 1)
    public void thirdTest(){
        System.out.println("test 3 is running");
    }



}
