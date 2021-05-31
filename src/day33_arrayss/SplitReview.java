package day33_arrayss;

import java.util.Arrays;

public class SplitReview {
    public static void main(String[] args) {
        String word = "java";
        String[] array =word.split("a");
        System.out.println(array.length);  //2
        int countOfA= array.length-1;
        if (word.endsWith("a")) {   // if ends with a , add one more .
            countOfA++;

        }
        System.out.println("countOfA = " + countOfA);
        System.out.println("------SPLIT WITH EMPTY STRING------");
        String[] strArr =word.split("");  //把string 变成char
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);
        System.out.println(strArr[3]);
        System.out.println(Arrays.toString(strArr));


        String word2 = "java1sql2hyml";
        String[] strArr2=word2.split("\\d"); // \\d就是任何数字。在这里表达以数字分开String
        System.out.println(strArr2[0]);
        System.out.println(strArr2[1]);
        System.out.println(Arrays.toString(strArr2));

        word2=word2.replaceAll("\\d","_");
        System.out.println("word2 = " + word2);

        System.out.println("===================================");

        String password = "bcTd123_5";
        if(password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
        


    }
}
