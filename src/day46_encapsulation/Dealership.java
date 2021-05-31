package day46_encapsulation;

public class Dealership {
    public static void main(String[] args) {
        Car car1= new Car();
        //下面会出现错误，因为model 和 year 在cai class 里是privet所以不能在别的课里用
       // car1.model = "Nissan Altima"；
        //car1.year = 2020;

        car1.setModel("Nissan Altima");
        System.out.println("car1 model = " + car1.getModel());

        car1.setYear(2020);
        System.out.println("car1 year = " + car1.getYear());

        car1.setMileage(2560);
        System.out.println("car 1 mileage = " + car1.getMileage());

        System.out.println(car1.toString());
        System.out.println(car1); //自动会把car 里的内容全部变成string

        Car alfaRomeo = new Car();
        alfaRomeo.setModel("AlfaRomeo  Giulia Ti AWD");
        alfaRomeo.setYear(2017);
        alfaRomeo.setMileage(16604);

        System.out.println("Model = " + alfaRomeo.getModel());
        System.out.println("Year = " + alfaRomeo.getYear());
        System.out.println("Mileage = " + alfaRomeo.getMileage());
        System.out.println(alfaRomeo);
    }
}
