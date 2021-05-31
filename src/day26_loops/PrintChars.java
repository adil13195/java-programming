package day26_loops;

public class PrintChars {
    public static void main(String[] args) {
          String word = "java";

        System.out.println(word.length());    //数数字


        //以下是正常用charat打出java ! ! !
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));

        System.out.println("====================================");

        //一下是用for loop打印 java ! ! !


        for (int i =0;i <word.length();i++){  // (从0开始；到4 结束；每次加1）
            System.out.println(word.charAt(i));
        }
        System.out.println("word = " + word);

        word ="java";
        for (int i =word.length() -1; i >=0;i--){
            System.out.print(word.charAt(i));
        }



    }
}
