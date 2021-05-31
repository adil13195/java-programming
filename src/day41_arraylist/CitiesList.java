package day41_arraylist;

import java.util.ArrayList;

public class CitiesList {
    public static void main(String[] args) {
        // declare arraylist
        ArrayList<String> cities = new ArrayList<>();
        //add cities to arraylist - > add methods
        cities.add("Washingtong DC");
        cities.add("New York");
        cities.add("Vienna");
        cities.add("Adana");
        cities.add("LA");
        //add Ashgabat to 0 index
        cities.add(0,"Ashgabat"); //另一种add .前面是位置后面是新加的string

        System.out.println("first city : " + cities.get(0));
        System.out.println("last city : " + cities.get(5));
        //find last index using size () -1
        System.out.println("last city " + cities.get( cities.size()-1));

        //print count of items in arraylist
        System.out.println("count of items" + cities.size());

        int size = cities.size();
        System.out.println("size = " + size);

        //for loop and  print all values in same line
        for (String city : cities){
            System.out.println(city + " ");
        }
        System.out.println();

        //delete item from arraylist
        //1.remove using index. delete value at index 3
        cities.remove(3);
        //2.remove using object/value
        cities.remove("New York");
        System.out.println("after remove = " + cities);

        //deleted/remove all values from list
        cities.clear();

        //make sure it is clear
        //1. print | spit out
        System.out.println("cities = " + cities);

        //2. using isEmpty
        if (cities.isEmpty()){
            System.out.println("List is empty");
        }

        //3. check size () ==0
        if (cities.size() ==0){
            System.out.println("List is empty");
        }





    }
}
