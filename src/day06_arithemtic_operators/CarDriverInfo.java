package day06_arithemtic_operators;

public class CarDriverInfo {
    public static void main(String[] args) {
        //   String carModel;
        //carModel="BMW x5";
        String carModel = "Dodge charger";
        String driverName = "Donald Trump";
        String LicenseNumber = "LetsMakeJacaGreatAgain12345";
        short speed = 55;
        boolean isAutomatic = true;
        char licenseClass = 'D';

        // Dodge charger is car model
        System.out.println("Car model:" +carModel);
        System.out.println(carModel+ " is car model");
        System.out.println("Driver name :" +driverName);
        System.out.println(driverName + "is driving a car");
        //Donald trump is driving Dodge charger
        System.out.println(driverName+" is driving "+carModel);

        System.out.println("Current speed is: "+speed);
        //Current speed is :55 mph
        System.out.println("Current speed: "+speed+"mph");
        System.out.println("is car automatic  -> "+isAutomatic);
        System.out.println(licenseClass +"  "+ isAutomatic);
        System.out.println();


    }
}
