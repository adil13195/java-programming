package day21_string_manipulation;

public class ReplacePractice {
    public static void main(String[] args) {
        String word = "github";
        System.out.println(word.toUpperCase());
        System.out.println(word.replace("github","gitlab"));
        System.out.println("word = " + word);
        
        word=word.replace("hub","lab");

        System.out.println(word.replace('i','o'));
        
        String sentence ="java is fun";
        String withNoSpaces = sentence.replace(" ","");
        System.out.println("withNoSpaces = " + withNoSpaces);
        
        sentence=sentence.replace("java","selenium").replace("fun","a lot of fun");

        System.out.println("sentence = " + sentence);

        String result = "1-48 of over 4,000 results for java book";
        result =result.replace("1-48 of over","");


    }
}
