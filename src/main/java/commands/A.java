package commands;

import com.github.javafaker.Faker;


public class A {
    public static void main(String[] args) {


        Faker faker = new Faker();

        String streetName = faker.address().streetName();
        String number = faker.address().buildingNumber();
        String city = faker.address().city();
        String country = faker.address().country();

        System.out.println(String.format("%s\n%s\n%s\n%s",
                number,
                streetName,
                city,
                country));
    }
}
