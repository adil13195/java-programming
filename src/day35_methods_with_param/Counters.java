package day35_methods_with_param;

public class Counters {
    public static void main(String[] args) {
        count(100);         //打印0-100 的数字 因为下面的loop
        count(8);
        int num2 =999;
        count(num2);
        String word ="wooden spoon";
        count(word.length());    // 打印0 到12， 因为word有12个字母

        printAge(1995);
        printAge(1988);

        int bithyear =2001;
        printAge(bithyear);
    }

    public static void count(int num){
        for (int i = 0; i <=num; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    /**
     * method name: printAge
     * @param/input: int year
     * "Birth year: 1984. Age: 38"
     */
    public static void printAge(int year){
        int age=2021-year;
        System.out.println(" Birth year :" + year+"Age : " + age);
    }


}
