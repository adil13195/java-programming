package day22_string_manipulation;

public class DynamicSubstring {
    public static void main(String[] args) {
        String result ="result count:12345";
        System.out.println(result.substring(13,18));
        System.out.println(result.substring(13));

        //find the index of
        System.out.println(result.indexOf(":"));
        int colonIndex =result.indexOf(":");   //colonIndex:12
        System.out.println(result.substring(colonIndex+1));   // 显示从：+1个之后的全部String
        //now we can combine them into 1 statement
        System.out.println(result.substring(result.indexOf(":")+1));

        String today = "i learned [java] today";
        /**
         * find indexof [
         *find index ]
         * provide them as start, end index for substring
         * to print java
         **/
        int start = today.indexOf("[");
        int end = today.indexOf("]");
        System.out.println(today.substring(start+1,end));

        System.out.println(today.indexOf("["));


    }
}
