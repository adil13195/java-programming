package day10_shorthand_operator;

public class Shorthandoperators {
    public static void main(String[] args) {
        int cars =10;
        System.out.println("cars in parking lot = " + cars);
        cars = cars+2;
        System.out.println("cars in parking lot =" + cars);

        //下面是简写方法：
        cars +=5;
        System.out.println("cars in parking lot =" + cars);

        System.out.println("================================");
        //使用在string 上简写方式：
        
        String world="java";
        System.out.println("world = " + world);
        
        world=world +" programming";
        System.out.println("world = " + world);

        world += "is fun";
        System.out.println("world = " + world);
    }
}
