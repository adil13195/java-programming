package day44_custom_classes;

public class MyApps {
    public static void main(String[] args) {
       //   String app1 = "Uber";  this is string object. just characters
        App uberApp = new App();
        //opening Uber app - version = 3.5

        uberApp.name = "Uber";
        uberApp.version=3.5;

        uberApp.open(); // call open method using object

        uberApp.version = 4.0;


    }
}
