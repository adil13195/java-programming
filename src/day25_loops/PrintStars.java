package day25_loops;

public class PrintStars {
    public static void main(String[] args) {
        for (int stars=1;stars<=15;stars++){
            System.out.print("\uD83C\uDF1F* " );
        }
        System.out.println(); //start new lane
        String myStars ="";

        //fill 5 stars to myStars variable.
        //一下是不用loop的方法：

        myStars+= "* "; //每次myStars 的数值多加一个*.
        myStars+= "* ";
        myStars+= "* ";
        myStars+= "* ";
        myStars+= "* ";

        System.out.println("myStars = " + myStars.trim());  //* * * * *

        //以下是用for loop的方法：
        myStars = ""; // 用for loop让int的数值加一个* .
        for (int i=1;i<=5;i++){
            myStars+="* ";
        }
        System.out.println("myStars = " + myStars.trim());
    }
}
