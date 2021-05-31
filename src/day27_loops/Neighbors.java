package day27_loops;

public class Neighbors {
    public static void main(String[] args) {
        String word = "jaavva";
        for (int n=0;n<word.length()-1;n++){ // -1是因为因为两个字母一起打印。打印到倒数第二个字母就够了

            System.out.print(word.charAt(n));
            System.out.println(word.charAt(n+1));
            if (word.charAt(n)==word.charAt(n+1)){
                System.out.println("beep - " + word.charAt(n));
            }
        }
    }
}
