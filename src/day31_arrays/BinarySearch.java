package day31_arrays;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums={233,123,654,2344,12345,14421};
        System.out.println(Arrays.binarySearch(nums,23));
        System.out.println(Arrays.binarySearch(nums,2344));
        System.out.println(Arrays.binarySearch(nums,25));  //因为不在nums里，所以会显示一个负数
        System.out.println(Arrays.binarySearch(nums,700));
        System.out.println(Arrays.binarySearch(nums,-5));

        //check if number 12345 is among numbers in array

        if (Arrays.binarySearch(nums,12345)>=0){  //如果12345 在nums 里那它相应的位置会比0 大
            System.out.println("12345 is present in array");
        }else { //如果不在那么就是负数，不会成立
            System.out.println("12345 is not in array");
        }


    }
}
