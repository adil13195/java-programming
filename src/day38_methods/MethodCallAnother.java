package day38_methods;


public class MethodCallAnother {
    public static void main(String[] args) {
        start();
    }
    public static void start(){
        System.out.println("start");
        continues();           //到continues 那一行
    }
    public static void continues(){
        System.out.println("continue");
        end();                  //到end 那一行
    }
    public static void end(){
        System.out.println("end");

    }
}
