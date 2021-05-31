package day09_scanner_practice;
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);   //scanner 格式=告诉java你需要scanner

        System.out.println("Enter hourly rate:");  //注释语

        double hourlyrate=scan.nextDouble(); //输入一个关于double的数字（带小数点）.= 输入的数字等于一个小时的收入

        double weeklypay = hourlyrate * 40.0;
        double monthlypay = weeklypay * 52 / 12;  //或者weeklypay *4
        double annualPay =  monthlypay * 12;


        System.out.println("weekly pay:" + weeklypay);
        System.out.println("Monthly pay:" + monthlypay);
        System.out.println("Annual pay :" + annualPay);




    }
}
