package day08_casting_scanner;

import javax.lang.model.SourceVersion;

public class CasttingExamples {
    public static void main(String[] args) {
        //byte - short - int - long
        byte num1 = 100;
        short num2 = num1;
        int num3 = num1;
        int num4 = 1000;
        long num5 = num4;

        //float-double
        float num6 = 12.4F;
        double num7=num6;

        int num8=3456;
        double num9=num8;
        System.out.println("num9 = " + num9);
        System.out.println("=====================");

        int num10=22;
        byte num11=(byte)num10;
        short num12=(short)num10;
        System.out.println("num10 = " + num10);
        System.out.println("num11 = " + num11);
        System.out.println("num12 = " + num12);

        double num13=55.3;
        float num14=(float)num13;

        char apple='A';
        int  banana=apple;
        System.out.println(banana);



    }
}
