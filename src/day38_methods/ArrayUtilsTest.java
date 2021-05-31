package day38_methods;

public class ArrayUtilsTest {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
    ArrayUtils.printArray(nums);
    ArrayUtils.printArray(new int[]{23,64,23,534,234,45,234,45}); //这是另一种方法

        System.out.println("sum = " + ArrayUtils.sum(nums));    //这样会显示nums里所有数字的的总和
        System.out.println("sum = " + ArrayUtils.sum(new int[]{23,64,23,534}));

        int[] nums2 = {4,1,5,8};

        System.out.println("found = " + ArrayUtils.contains(nums2,5));
        System.out.println("found = " + ArrayUtils.contains(nums2,10));  //找num2里有没有10
    }
}
