package day14_multi_branch_if_operators;

public class CaculatorV1 {
    public static void main(String[] args) {
        double num1 = 5.5;
        double num2 = 2.5;
        char operator = '+';

        if (operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '*') {
            System.out.println(num1 * num2);
        } else if (operator == '/') {
            System.out.println(num1 / num2);
        }else{
            System.out.println("good job");
        }
    }
}
