package day28_loops;

public class FindUniqurChars {
    public static void main(String[] args) {
        String word ="javvvzvvaaaaa";
        String unique = "";

        for (int i =0; i<word.length();i++){
            //if word,charAt(i) is not contains in unique
            //add to unique
            if (!unique.contains(word.charAt(i) +"")){
                unique+= word.charAt(i);   // unique=j ,unique =ja,unique =jav, 再检查到有v 所以加上！之后if 变成！fales=true.
            }                               //所以不再检查之后的字母unique变成=jav跳出if .
        }
        System.out.println(unique);

    }
}
