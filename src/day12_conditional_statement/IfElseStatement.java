package day12_conditional_statement;

public class IfElseStatement {
    public static void main(String[] args) {
        if(10>5) {
            System.out.println("CONDITION IS TRUE");
        }else{
            System.out.println("CONDITION IS TRUE");
        }

        int coutnt=25;
        //check if count is more than 30. if yes , print"count is more than30"
        //otherwise print "count is lees than 30"


        if(coutnt>30){           //因为这是错的(20>30)，所以会显示 Less than 30
            System.out.println("count is more than 30");
        }else{
            System.out.println("count is lees than 30");
        }

        byte age=25;
        if (age>=18){
            System.out.println("Eligible to vote");
            System.out.println("Age is greater or equal to 18");
        }else {
            System.out.println("Not Eligible to vote");
            System.out.println("Age is lees than 18"); //
        }


    }
}
