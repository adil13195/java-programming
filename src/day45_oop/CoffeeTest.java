package day45_oop;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee myCoffee = new Coffee();
        System.out.println("coffee amount = " + myCoffee.getAmount());
        myCoffee.refill();
        System.out.println("amount after refill = " +myCoffee.getAmount());
        myCoffee.drink(10);
        System.out.println("amount after drink 10 = " + myCoffee.getAmount());
        // NOT : myCoffee.type = "Turkish coffee " ; Instead using a method:
        myCoffee.setType("turkish coffee");
        System.out.println("My coffee = " + myCoffee.getType());
        //describe myCoffee - show all variable value
        System.out.println(myCoffee.toString());

        //Add another coffee object , set values , call method
        Coffee coffee1 = new Coffee();
        coffee1.setType("cappuccino");
        System.out.println("coffee1 type = " + coffee1.getType());

        //assign coffee1 object to coffee2
        Coffee coffee2 = coffee1;

        System.out.println("coffee2 type = " + coffee2.getType());
        coffee2.setType("Espresso");

        Coffee coffee3 = new Coffee();
        coffee3.setType("Frappucino");

        coffee3 = coffee2;
        System.out.println("coffee 3 type = " + coffee3.getType());

        Coffee coffee4 = null; //reference variable does not refer / point to any object in HEAP
        coffee4.setType("turkish");  // NullPointerException

        System.out.println();

    }
}
