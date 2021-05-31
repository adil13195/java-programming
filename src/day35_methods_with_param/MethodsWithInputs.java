package day35_methods_with_param;

public class MethodsWithInputs {
    public static void main(String[] args) {
        displayValue(5);//在这个括号里写Int的数值
        displayValue(20); //每一次可以输入不同的Int数值
        int count = 55;
        displayValue(count); //num=count;

        greetByName("adil");
    }
    public static void displayValue(int num){   //在这里设置int为空数值
        System.out.println("value is " + num);
    }
    /**
     * method name: greetByName
     * @param/input: String name
     * It prints "Hello {name}, how are you today?
     */
    public static void greetByName(String name){
        System.out.println("Hello "+name +" ,how are you today ?" );
    }

}
