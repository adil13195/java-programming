package day_15_logicalops_switch_ternary;

public class JobOfferSlector {
    public static void main(String[] args) {
        String location ="Honolulu";
        double salary = 120_000.0;
        boolean isRemote = true;
        boolean benefits = false;

        if (location.equals("Honolulu") && salary >= 120_000.0 && isRemote && benefits){
            System.out.println("Sure, I will accept this offer " );
        }else
            System.out.println("lets consider another offer or negotiate");
    }
}
