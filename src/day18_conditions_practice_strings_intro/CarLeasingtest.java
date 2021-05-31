package day18_conditions_practice_strings_intro;

public class CarLeasingtest {
    public static void main(String[] args) {
        String make ="Mercedes";
        String model="E";
        double leasPrice =0.0;

        if (make.equals("Mercedes")&&model.equals("E")){
            leasPrice =500.0;
        }else if (make.equals("Mercedes")&&model.equals("A")){
            leasPrice=400.0;
        }
        System.out.println("make = "+make);
        System.out.println("model = " + model);
        System.out.println("leasPrice = " + leasPrice);
    }
}
