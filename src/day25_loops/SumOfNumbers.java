package day25_loops;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum =0;
        // 1-5
        for (int i=1;i<=5;i++){
            System.out.println(i);
            sum +=i;
        }
        System.out.println("sum = " + sum); //sum=0+1;sum=1+2;sum=3+3;sum=6+4;sum=10+5 =15

        //以下是不用for loop的计算方式
        int sum2=0;
        sum2 +=1;
        sum2 +=2;
        sum2 +=3;
        sum2 +=4;
        sum2 +=5;

        System.out.println("sum2 = " + sum2);


    }
}
