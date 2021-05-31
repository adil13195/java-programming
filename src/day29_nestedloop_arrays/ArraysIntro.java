package day29_nestedloop_arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        int num =10; // single variable
        int[]nums = new int[3];// array variable
        nums[0]=5;
        nums[1]=10;
        nums[2]=7;
        System.out.println("value at index 0 " + nums[0]);
        System.out.println("value at index 1 " + nums[1]);
        System.out.println("value at index 2 " + nums[2]);

        //we can also use int variable to specify index number
        int i=0;
        System.out.println(nums[i]); //打印num[在i相应位置的数字（也就是num[0]的数字就是5]
        i++;
        System.out.println(nums[i]);//i + 1=0+1=1. 所以打印num[1]的数值就是: 10

        //how to find out the size the array .
        System.out.println("number of element = " +nums.length ); //因为nums有3个数值。所以打印：3

        // store length of array into len variable
        int len= nums.length;
        System.out.println("len = " + len);

        //change variable in the array:
        nums[0] =100;
        nums[1] =300;
        //read the value of index 1 and assign same to index 2
        nums[2] =nums[1];

        System.out.println("nums [0] = " + nums[0]);
        System.out.println("nums [1] = " + nums[1]);
        System.out.println("nums [2] = " + nums[2]);

    }
}
