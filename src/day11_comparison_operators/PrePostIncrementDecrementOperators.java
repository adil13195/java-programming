package day11_comparison_operators;

public class PrePostIncrementDecrementOperators {
    public static void main(String[] args) {
        //PRE-INCREMENT
        int num1 = 10;
        int num2 = ++num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        //POST-INCREMENT
        int num3 = 8;
        int num4= num3;
        num3++;
        System.out.println("num3 = " + num3); //9
        System.out.println("num4 = " + num4);  //8


        System.out.println("_________________");
        int apples = 5;
        int basket = ++apples;    //加号在前

        System.out.println("apples = " + apples);
        System.out.println("basket = " + basket);

        int kiwi=15;
        int kiwiBasket = kiwi++;  // 加号在后
        System.out.println("kiwi = " + kiwi);
        System.out.println("kiwiBasket = " + kiwiBasket);

        int cars=5;
        System.out.println(++cars);

        int sedans =10;
        System.out.println(sedans++);
        System.out.println(sedans);

        System.out.println("++++++++++++++++++++++++++++");


        int a=50;
        int b= 22;
        int c= a++ + ++b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
