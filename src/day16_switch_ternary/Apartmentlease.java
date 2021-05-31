package day16_switch_ternary;

public class Apartmentlease {
    public static void main(String[] args) {
        int numberofbedroom=0;
        double startingPrice=0;
        switch (numberofbedroom){
            case 0:
                startingPrice = 1190;
                System.out.println("Studio apartment selected");

                break;
            case 1:
                System.out.println("One bedroom apartment selected");
                startingPrice=1490;
                break;
            case 2:
                System.out.println(" Two bedroom apartment selected");
                startingPrice=1790;
                break;

            default:
                System.out.println("5 bedroom currently unavailable");
        }
        System.out.println("startingPrice:" + startingPrice);
    }
}
