package day25_loops;

public class PrintEvenOrOddNumbers {
    public static void main(String[] args) {

        //打印一百以内的奇数。还有偶数！！！
        System.out.println("EVEN NUMBERS 0-100：");
        for (int n=0;n<=100;n++){
            if (n % 2==0){
                System.out.print(n +" ");
            }
        }
        System.out.println("\n ODD NUMBERS 0 -100: ");

        for (int k=0;k<=100;k++){
            if (k % 2 != 0){
                System.out.print(k + " ");
            }
        }



    }
}
