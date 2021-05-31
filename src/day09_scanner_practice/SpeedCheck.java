package day09_scanner_practice;
import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter sppedlimit: ");

        int currentSpeed = scan.nextInt();
        int speedlimit = 55;
        int overTheLimit = currentSpeed - speedlimit;

        System.out.println("you are driving " + overTheLimit + "mph over the limit. Slow down!");

    }
}
