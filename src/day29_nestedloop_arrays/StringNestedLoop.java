package day29_nestedloop_arrays;

public class StringNestedLoop {
    public static void main(String[] args) {
                        //0123
        String word ="java";
                //在length里是1234. 数出来有四个字母。但在charat是0123相应位置对应相应的字母
        for (int i = 0; i <word.length(); i++) {
            for (int j = 0; j <i; j++) {
                System.out.print(word.charAt(j));
            }
            System.out.println();


        }
        System.out.println( " ===============================================");


        for (int i = 0; i < word.length(); i++) {
            for (int j=i ;j < word.length();j++){
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }
    }
}
