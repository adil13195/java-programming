package day_15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Moscow";
        //Moscow or Tampa
        if (city.equals("Moscow") || city.equals("Tampa")){
            System.out.println("Willing to relocate to" + city);
        }else{
            System.out.println("Not considering -" + city);
        }

        String teacher = "Saim";
        if (teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println("It is a java class with" + teacher);
        }else{
            System.out.println("Soft skill class with" + teacher );
        }

    }
}
