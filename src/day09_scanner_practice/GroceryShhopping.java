package day09_scanner_practice;
import java.util.Scanner;  //★

public class GroceryShhopping {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);  //★

        System.out.println("Enter price for milk: ");
        double priceForMilk=scan.nextDouble();

        System.out.println("Enter price of bread: ");
        double priceofbread=scan.nextDouble();

        System.out.println("Enter price of cucumbers: ");
        double priceofcucumbers=scan.nextDouble();

        double Total=priceForMilk+priceofbread+priceofcucumbers;
        System.out.println("your Total = " +Total);




    }
}
