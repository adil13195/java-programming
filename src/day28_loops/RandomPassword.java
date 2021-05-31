package day28_loops;
import java.util.Random;

public class RandomPassword {
    public static void main(String[] args) {
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_!@#$%^&*";
        Random raandom = new Random();
        String password ="";

        for (int i =1; i <=8;i ++){   // 需要8次loop /需要8个字母的密码 。
            int n = raandom.nextInt(71 ); // random num 0 -70
            System.out.print(source.charAt(n));

            password+= source.charAt(n);

           // System.out.println(raandom.nextInt(source.length()));
        }

        System.out.println(" \nYour password = " + password);

        System.out.println(source.length());    // length 算出string 里有几个字母。 但不会从0开始数。有多少个就是多少！




    }
}
