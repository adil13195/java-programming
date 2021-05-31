package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(5,20));
        double sum = add(1,3);
        System.out.println("sum = " + sum);
        System.out.println("100 + 200 = " + add(100,200));
        System.out.println(minus(15,5));
        System.out.println(multiply(5,6));
        System.out.println(divide(50,5));
    }

    public static double add(double num1,double num2){   //两个数相加用法
        double result = num1+num2;
        return result;           // return 后面写什么，打印出来就是相应的数字
    }
    public static double minus(double num1,double num2){
        double result =num1 -num2;
        return result;
    }
    public static double multiply(double num1 ,double num2){
        double result =num1*num2;
        return result;
    }
    public static double divide (double num1 ,double num2){
        double result =num1/num2;
        return result;
    }


}
