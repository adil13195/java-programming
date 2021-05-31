package day12_conditional_statement;

public class ComparisonExamples {
    public static void main(String[] args) {

        int currentSpped=45;
        int speedLimit=55;

        System.out.println(currentSpped > speedLimit); // false 45 Not MORE 55
        System.out.println(speedLimit < currentSpped);  //FALSE 55 NOT LESS 45
        System.out.println(speedLimit == currentSpped); //false 55 NOT EQUAL TO 45

        boolean isSpeeding = currentSpped > speedLimit;
        System.out.println(" Are you speeding ? -" +isSpeeding );
        System.out.println("currentSpped = " + currentSpped);
        System.out.println("speedLimit = " + speedLimit);

        currentSpped +=20; // 45+20=65

        isSpeeding = currentSpped >speedLimit;
        System.out.println("Are you speeding? -" + isSpeeding);
        System.out.println("currenSpeed = " + currentSpped + "mph");
        System.out.println("sppedlimit = "+ speedLimit + "mph");


        System.out.println("=========================");
        double accountBalance =250.25;
        double itemPrice =100;
        System.out.println("can I afford ? -" + (accountBalance >= itemPrice)); //true

        boolean canAfford =accountBalance >= itemPrice;
        System.out.println(" can afford = " + canAfford);

        //decrease balance by itemPrice. using shorthand operator
        accountBalance= accountBalance - itemPrice;
        accountBalance -=itemPrice;

        boolean isBroke = accountBalance <=0;
        System.out.println("Am I broke ? " + isBroke);





    }
}
