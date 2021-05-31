package day39_wrapper_classes;

public class WrapperClassMethod {
    public static void main(String[] args) {
        System.out.println(Integer.max(10,5));   //打印最大的
        System.out.println(Integer.sum(50,35));  //sum是总和的意思
        System.out.println(Integer.min(5,2));    //打印最小的。 min
        System.out.println("MIN INT: " + Integer.MIN_VALUE);
        System.out.println("Max INT:" + Integer.MAX_VALUE);
        System.out.println(Double.max(234.4,23.9));
        System.out.println("MIN DOUBLE: " + Double.MIN_VALUE);
        System.out.println("MAX DOUBLE: " + Double.MAX_VALUE);

                        //compare就是比较 ! ! ! !
        System.out.println(Double.compare(5,1));// 第一个数字比第二个大： 显示：1
        System.out.println(Double.compare(5,5));//两个数字一样大： 显示0
        System.out.println(Double.compare(5,45));// 第一个数字比第二个小： 显示-1

                            //Digit问是不是数字。
        System.out.println(Character.isDigit('8'));  //8 是数字所以显示：true
        System.out.println(Character.isDigit('v'));  //'v'不是数字所以false

        // TODO: 4/19/2021  这个需要google 查询
        System.out.println(Character.isAlphabetic('Q'));
        System.out.println(Character.isAlphabetic('r'));
        System.out.println(Character.isAlphabetic('9'));

        char letter='A';
        if (Character.isUpperCase(letter)){
            System.out.println("it is uppercase");
        }
        String word ="JaVa iS FuN";

        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))){
                System.out.println(word.charAt(i));
            }
        }
        System.out.println(Character.MIN_VALUE);
    }
}
