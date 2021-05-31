package day37_methods_overloading;
//可以用同样的名字，不同数量的（）， 按几个就会显示相应的Void! ! !
public class MethodOverloading {
    public static void main(String[] args) {

        MethodOverloading.sum(10, 5);
        sum(10.4, 12.4);
        sum(10, 5.5);
        sum(4, 1, 2);
        sum((int)4.2, 1, 2);
        sum("Hello", "World");

    }

        public static void sum(int num1, int num2) {   //两个Int！ 按两个数字的时候会显示
            System.out.println("sum(int , int )");
            System.out.println("Result = " + (num1 + num2));
        }

        public static void sum(int num1, int num2, int num3) { // 三个Int 按三个数字的时候会显示
            System.out.println("sum(int , int , int )");
            System.out.println("Result = " + (num1 + num2 + num3));
        }

        public static void sum(double num1, double num2) {   //按两个double的时候会显示
            System.out.println("sum(double, double)");
            System.out.println("Result = " + (num1 + num2));
        }

        public static void sum(String str1, String str2) { //按两个string的时候会显示
            System.out.println("sum(string, string)");
            System.out.println("Result = " + (str1 + str2));
        }

    }

