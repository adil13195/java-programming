package day24_loops;
import java.util.*;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner scan=new Scanner(System.in);
      //  System.out.println(random.nextInt(101));
        int secretNumber=random.nextInt(100);  //给JAVA表示这个数字在100以内
        int guessingNumber=0;
        do {
            System.out.println("Guess the secret number");
            guessingNumber=scan.nextInt();
            if (guessingNumber>secretNumber){
                System.out.println("wrong , you number is too lage");
            }else{
                System.out.println("wrong, your number is too small");
            }
        }while (secretNumber != guessingNumber);
        System.out.println("Congratulations, you won! secret number:" + secretNumber);

    }
}
