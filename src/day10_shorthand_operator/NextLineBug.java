package day10_shorthand_operator;
import java.util.Scanner;

public class NextLineBug {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Ebter rent and month : ");
        double rent=scan.nextDouble();
        scan.nextLine();    //fix the bug.WORKAROUND xian'shi
        String month=scan.nextLine();

        System.out.println("rent = " + rent);

        System.out.println("month = " + month);

    }
}
