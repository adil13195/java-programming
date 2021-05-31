package day36_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {
        checkEligible(815);
        System.out.println(getCreditScore());         //这里就会打印800.因为return value是800
        System.out.println("Score = " + getCreditScore());
        int score =getCreditScore();
        System.out.println("score = " + score);;

    }

    public static void checkEligible(int creditScore){
        if (creditScore >=700){
            System.out.println(" you are eligible for leasing this car");
        }else {
            System.out.println("Sorry, you are not eligible for leasing thos car");
        }
    }
    public static int getCreditScore(){    //设立一个int
        return 800;                  // return 的意思是这个int的数值 。 是800.
    }
}
