package day40_arraylist;

import java.util.*;

public class ArrayListLoop {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(); //Polymorphic way of declaring
        System.out.println(nums);
        System.out.println("size = "+nums.size());

        nums.add(34); nums.add(44); nums.add(3); nums.add(88);
        nums.add(500); nums.add(5);nums.add(845);nums.add(0);
        nums.add(500); nums.add(5);nums.add(845);nums.add(0);

        System.out.println("nums = " + nums);

        nums.remove(0);     //删掉nums 里在0位置的数字；
        System.out.println("nums = " + nums);

       // nums.remove(88);// -> index 88 -> IndexOutOfBoundsException

        nums.remove(new Integer(88));   //删掉nums 里的数字 88
        System.out.println("nums = " + nums); // 但是只会删除第一个88，如果要全部删除88要用loop.

        //for loop - iterate through all values and print
        //用loop 删除里面所有88. 或者某个数字！ ！ ！

        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));

        }

        //for each loop, and print all in same line
        for (int each : nums){
            System.out.print(each + " ");
        }




    }
}
