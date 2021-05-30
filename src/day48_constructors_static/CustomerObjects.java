package day48_constructors_static;

public class CustomerObjects {
    public static void main(String[] args) {
        Customer cs1 =new Customer();
        System.out.println(cs1.toString()); // print with default values that are set in no-args constructor
        cs1.setId(1);
        cs1.setName("Bob");
        System.out.println(cs1);

        Customer cs2 = new Customer("Mike",2); // create object and assign values in same statement
        Customer cs3 = new Customer("Adil",1234);
        System.out.println(cs2);
        System.out.println(cs3);
    }
}
