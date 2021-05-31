package day33_arrayss;

import java.util.Arrays;

public class MultiDArrayExample {
    public static void main(String[] args) {
        /**
         *              0                 1
         0    "Teodora Tsvetanov"    "TeodorasPWD12"
         1    "Anna Ziyayeva"    "AnnaAlmaty123"
         2    "Parvin Altae"    "ParvinVienna321"
         */
        String[][] users = new String[3][2];  // 第一竖行三个，横着两个
        users[0][0] = "Teodora Tsvetanov";
        users[0][1] = "TeodorasPWD12";
        users[1][0] = "Anna Ziyayeva";
        users[1][1] = "AnnaAlmaty123";
        users[2][0] = "Parvin Altae";
        users[2][1] = "ParvinVienna321";

        String[][] userData ={{"Teodra Isvetanov","TeodorasPWD12"}, //00 ---01
                             {"Anna Ziyayeva", "AnnaAlmaty123"}, //10---11
                             {"Parvin Altae" , "ParvinVienna321"} };  //20---21
        System.out.println(userData[0][0]);
        System.out.println(userData[1][0]);
        System.out.println(userData[2][0]);

        System.out.println(userData[0][1]); //打印第一竖行0位置和第二竖行位置1
        System.out.println(userData[1][1]);  //打印第一竖行1位置和第二竖行位置1
        System.out.println(userData[2][1]);  //打印第一竖行2位置和第二竖行位置1

        System.out.println(Arrays.deepToString(userData));
    }
}
