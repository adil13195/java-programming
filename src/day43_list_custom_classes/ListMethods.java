package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ListMethods {
    public static void main(String[] args) {
        System.out.println(getDays());
        System.out.println("getDays().size() = " + getDays().size());
        System.out.println("getDays().size() = " + getDays().get(0));
        List<String> dayNames = getDays();
        System.out.println("dayNames = " + dayNames);
        dayNames.add("java day");

        dayNames.removeIf(day ->day.length()==6); //这里没有搞懂
        System.out.println("dayNames after removeIf = " + dayNames);
        System.out.println(getRandomList(10));
       List<Integer> nums = getRandomList(100);
        System.out.println("nums.size() = " + nums.size());
        System.out.println("nums = " + nums);
        nums.removeIf(n ->n<90); //remove nums less than 90
        System.out.println("nums = " + nums);
    }


    public static List<String> getDays(){
        //List<String> days = new ArrayList<>(Arrays.asList("Monday,Tuesday,Wednesday,Thursday,Friday"));
        List<String> days = new ArrayList<>();
        days.add("Monday"); days.add("Tuesday"); days.add("Wednesday"); days.add("Thursday");
        days.add("Friday"); days.add("Saturday"); days.add("Sunday");

        return days;
    }
    /**
     getRandomList
     param: int size
     return List<Integer>
     generate random numbers(0-100) the count of size, and assign to List then return
     getRandomList(3) -> 43, 12, 54
     getRandomList(2) -> 1, 4
     */
    public static List<Integer> getRandomList(int size){
        Random random = new Random(); // new Random object
        List<Integer> nums = new ArrayList<>();
        for (int i =1;i <= size;i++){
           // int n = random.nextInt(101);
            //if (!nums.contains(n)){
              //  nums.add(n);
            //}
           nums.add(random.nextInt(101));// generate random number and to list
        }
        return nums;
    }
}