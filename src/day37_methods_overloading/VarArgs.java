package day37_methods_overloading;

public class VarArgs {                     //varargs
    public static void main(String[] args) {
        addNumber(2,5,6);
        addNumber(2,3,2,3,2,3,23,2,3,32,3,23,3);
    }
    public static void addNumber(int ...nums){   //...的意思就是可以输入多个数字
        //inside the method, it is used as regular array
        int sum=0;
        for (int n:nums){
            sum+=n;
        }
        System.out.println("nums" + sum);

    }
}
