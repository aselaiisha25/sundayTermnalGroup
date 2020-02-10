package seleniumIntro;

import com.github.javafaker.Faker;

public class JavaFakerExample {
    public static void main(String[] args) {
        Faker faker=new Faker();
        String name=faker.name().fullName();
        String dogName=faker.name().firstName();


        System.out.println("Full name "+name);
        System.out.println("First name "+ dogName);




    }


}
