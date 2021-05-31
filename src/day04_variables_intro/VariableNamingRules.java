package day04_variables_intro;

public class VariableNamingRules {
    public static void main(String[] args){
        //todo:haha ;
        int static2=22;
        int _static=22;
        int $tatic=44;
        int staticVar=234;

        int salary$=55;
        // int 1stMonthSalary=300--> erro, cannot start with number
        int $=10;
        int _=3;
        System.out.println("$");
        System.out.println($);
        System.out.println("_");
        System.out.println(_);
        // Above variables work fine , but not recommended.
        //we should use meaingful variable names
        //intr number -of-friendds=400; ->
        int numberOfFriends =401;
        int number_of_friends=401; // not convention

        //int 1stNum=10; CANNOT START WITH NUMBER
        int num1=10; // works fine
    }
}
