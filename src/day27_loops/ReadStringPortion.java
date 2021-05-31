package day27_loops;

public class ReadStringPortion {
    public static void main(String[] args) {


        String list = "cat,car,cat,red_car,java,selenium";
        //using substring print first 3 letter
        System.out.println(list.substring(0,3));   //打印String 里0-3位置里的字母
        System.out.println(list.substring(2,5));
        System.out.println(list.substring(3,6));
        System.out.println(list.substring(4,7));


        System.out.println(" ============================================");
        //用for 的方式：
        for (int i=0;i <list.length()-2;i++){     //因为每次打印3个字母所以-2 . 让for —2 的时候结束。 这样就能打印最后三个字母
            System.out.println(list.substring(i,i+3));  // 打印（i开始，到i之后三个字母）；
            if (list.substring(i,i+3).equals("cat") || list.substring(i,i +3).equals("car")){
                System.out.println("cat for car found");
            }

        }
    }
}
