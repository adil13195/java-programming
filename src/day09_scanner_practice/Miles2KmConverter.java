package day09_scanner_practice;

import java.util.Scanner;

public class Miles2KmConverter {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in); // 或者:Scaner scan input=new Scanner (System.in);

        System.out.println("######MILES TO KM CINVERTER###### ");
        System.out.println("Enter miles: ");

        double miles = scan.nextDouble();

        double kilometer = miles * 1.609;

        System.out.println(miles + " in kilometers:" + kilometer);


    }
}
