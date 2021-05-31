package day10_shorthand_operator;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance =1230.55;
        System.out.println("balance = " + balance);

        double baklava=22.50;
        System.out.println("baklava = " + baklava);

        //decrease balance by baklava price
        balance = balance - baklava;
        System.out.println("balance after baklava = " + balance);

        double plov =7.99;
        System.out.println("plov = " + plov);
        balance=balance - plov;
        System.out.println("balance after plov = " + balance);





    }
}
