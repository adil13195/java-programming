package day_15_logicalops_switch_ternary;

public class NotlogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true = " + (!true));
        System.out.println("!false = "+ (!false));

        int age=20;
        //check if age is not more than 7. print "need to sit in child car seat.age

        if (!(age>7)){
            System.out.println("Need to sit in child car seat. age = " + age);
        }else {
            System.out.println("Can sit normal seat age = " + age);
        }

        System.out.println("=========================================");


        boolean isSmokingAllowed = true;
        // if smoking is not allowed : print "Smoking is now allowed here. Exit"
        if (!isSmokingAllowed){
            System.out.println("Smoking is now allowed here. Exit");
        }else {
            System.out.println("this area is for smiking");
        }


        String carModel = "Tesla";
        // if its not Tesla , print "NOT interested"
        if (!carModel.equals("Tesla")){
            System.out.println("Not interested , thank you ");
        }
        String secretPassworld = "abc123";
        String inputPassworld = "adc321";
        //if inputPassworld IS NOT equals inputPassworld : print "INcorrect Passworld"
        if(!inputPassworld.equals("abc123")){
            System.out.println("Incorrect passwold");
        }
        if (! inputPassworld.equals(secretPassworld)){
            System.out.println("Incorrect password");
        }
        if (inputPassworld.equals("abc123")){
            System.out.println("aaaaa");

        }
    }
}
