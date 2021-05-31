package day19_class_vs_object_strings;

public class StringLength {
    public static void main(String[] args) {
        String word ="java";
        System.out.println(word);
        System.out.println(word.length());
        System.out.println("count:" + word.length());
        System.out.println("wooden  spoon".length());
        System.out.println(" +++++++++++++++++++++++");
        String firstName = "Nadir";
        System.out.println(firstName + "_" + firstName.length());

        int count=firstName.length();
        System.out.println("count = " + count);

        String password="abc123";
        /** if statement
         *
         */

        if (password.length() >=6){
            System.out.println(" Valid amazon password " );
        }else {
            System.out.println(" Passwords must be at least 6 char");
        }
    }
}
