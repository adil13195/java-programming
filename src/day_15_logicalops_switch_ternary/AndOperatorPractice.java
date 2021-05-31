package day_15_logicalops_switch_ternary;

public class AndOperatorPractice {
    public static void main(String[] args) {
        boolean onSale = true;
        boolean freeShipping = true;
        String iteamName = "wooden Spoon";

        if(onSale==true && freeShipping==true){
            System.out.println(" Adding to cart - " + iteamName);
        }else {
            System.out.println("Continue shopping for good deals on -" + iteamName);
        }

        //add to cart only when it is freeShipping, onSale and iteamName is "Wodden Spoon"

        if (freeShipping && onSale && iteamName.equals("wooden Spoon")){
            System.out.println("Adding to cart - " + iteamName);

        }else {
            System.out.println("Continue shipping for good deals on - "+ iteamName);
        }
        //location, salary, remote,benefits


    }
}
