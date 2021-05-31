package day18_conditions_practice_strings_intro;

public class SwitchSeasonFinder {
    public static void main(String[] args) {
        int month = 1;
        if (month ==12 || month ==1|| month==2){
            System.out.println("Winter");
        }

        switch (month){
            case 12:
                System.out.println("Winter");
                break;
            case 1:
                System.out.println(" Winter2");
                break;
            case 2:
                System.out.println("Winter");
                break;

        }

    }
}
