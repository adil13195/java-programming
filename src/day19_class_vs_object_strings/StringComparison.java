package day19_class_vs_object_strings;

import java.nio.charset.StandardCharsets;

public class StringComparison {
    public static void main(String[] args) {
        String city ="Chicago";
        System.out.println(city.equals("Chicago"));  //true
        System.out.println(city.equals("chicago"));  //false

        System.out.println(city.equalsIgnoreCase("Chicago"));  //TRUE   告诉java不要管大小写之后：
        System.out.println(city.equalsIgnoreCase("CHICAGO"));  //TRUE
        System.out.println(city.equalsIgnoreCase("ChiCaGo"));  //TRUE
        System.out.println(city.equalsIgnoreCase("Chiicago")); //但是字母错了就会显示false
        System.out.println(city.equalsIgnoreCase("Chi cago"));  //但是字母错了就会显示false

        if (city.equals("CHICAGO")){
            System.out.println("equals() true");
        }else {
            System.out.println("euals() false");
        }
        if (city.equalsIgnoreCase("CHICAGO")){
            System.out.println("equalsIgnoreCase （） true");
        }else {
            System.out.println("equalsIgnoreCase () false");
        }
    }
}
