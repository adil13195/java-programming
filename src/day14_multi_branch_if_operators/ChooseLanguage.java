package day14_multi_branch_if_operators;
import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("Choose your language");
        int selection = scan.nextInt();
        if (selection == 1){
            System.out.println("hello, thank for your call");
        }
        else if (selection ==2){
            System.out.println("hola, qracias para llamar");
        }else if (selection==3){
            System.out.println("merhaba ,aradiqiniz icin tesekkurler");
        }else if(selection ==4 ){
            System.out.println("privet, spasibo za vash zvonok");
        }else if(selection ==5){
            System.out.println("Merci , pour votre appel");
        }else{
            System.out.println("lets talk java and english, hello");
        }
    }
}
