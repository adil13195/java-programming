package day16_switch_ternary;

public class Elevator {
    public static void main(String[] args) {
        int floorNum = 1;
        if (floorNum == 1){
            System.out.println("Floor 1 selected .Companies :Lobby,Verizon, Starbucks");
        }else if(floorNum == 2){
            System.out.println("Floor 2 selected .companies: Cybertek");
        }else if (floorNum == 3){
            System.out.println("Floor 3 selected . Bofa");
        }else {
            System.out.println("Invalid floor" + floorNum);
        }

        System.out.println(" ===========SWITCH STATEMENT VERSION ============");

        floorNum=3;
        switch (floorNum){
            case 1:                 //SAME AS IF(FLOORNUM == 1)
                System.out.println("Floor 1 selected .Companies :Lobby,Verizon, Starbucks");
                break; // Exit Switch
            case 2 :
                System.out.println("Floor 2 selected .companies: Cybertek");
                break; //Exit the Switch Statement
            case 3:
                System.out.println("Floor 3 selected . Bofa ");
                break;
            default:
                System.out.println("Invalid floor" + floorNum);
                break;

        }
    }
}
