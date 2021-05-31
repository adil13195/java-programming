package day05_primitives_concatanation;

public class CellPhone {
    public static void main(String[] args){
        String brand="iphone"; //striing用在两边都是单词，或者带数字
        String model="iphone 11";
        String color="gold";
        double price=699.99; // double 用在不是整数的变量
        int storage=256;
        boolean hascamera=true;
        System.out.println(brand);
        System.out.println(model);
        //with massage
        System.out.println("Brand is"+ brand);
        System.out.println("Model　is　"+model);
        System.out.println("color is "+color);
        System.out.println("price is $"+price);
    }
}
