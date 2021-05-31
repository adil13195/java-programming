package day08_casting_scanner;

public class ShopingBlanceCalcutator {
    public static void main(String[] args) {
        double blance=345.55;
        double price1=20.88;
        double price2=89.99;
        double price3=15.0;

        double reaminingBlalance=blance - price1 - price2 - price3;
        // or remainingBakance= balance-(price1 + peice2 + price3);
        System.out.println(reaminingBlalance);


        int balamnceWithNoCents=(int)reaminingBlalance; //double变int
        System.out.println(balamnceWithNoCents);


    }
}
