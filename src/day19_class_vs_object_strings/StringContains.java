package day19_class_vs_object_strings;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital one";
        System.out.println(company.equals("i"));  //true
        System.out.println(company.contains("ital")); //true
        System.out.println(company.contains("l o")); //true
        System.out.println(company.contains("j"));
        System.out.println(company.contains("One"));

        //if company contains space, print "multiple words company name"
        //else "single word company name

        String etsyTitle = "Wooden spoon |Etsy";

        if (etsyTitle.contains("|")){
            System.out.println("Pass - title check passed");
        }else {
            System.out.println("Fail - title check failed");
        }

        String firstName = "ahmed";
        //check if firstName contains "a" and "e" at same time.
        if(firstName.contains("a") && firstName.contains("e")) {
            System.out.println("both a && e are present");
        }else {
            System.out.println("a || e not present");
        }

        //check if firstName contains "a" and "e" at same time.
        if(firstName.contains("a") && firstName.contains("e")) {
            System.out.println("both a && e are present");
        }else {
            System.out.println("a || e not present");
        }




    }
}
