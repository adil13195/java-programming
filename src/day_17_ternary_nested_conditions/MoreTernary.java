package day_17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 35;
        String reply= hourlyRate>45 ? "accept":"reject";
        System.out.println("reply = " + reply);

        String todaysClass="java";
        String teacher =(todaysClass.equals("java")) ? "Saim Murodil" :"Nadir";
        System.out.println("teacher = " + teacher);

        boolean isEligibleToDrive = true;
        //"have Dl and Can drive ." "Not Dl.cannot drive"
        String driving = isEligibleToDrive ? "yes" :"no";
        System.out.println("driving = " + driving);
    }
}
