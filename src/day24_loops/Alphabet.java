package day24_loops;

public class Alphabet {
    public static void main(String[] args) {
        char letter = 'a';


        while (letter <= 'z') {
        System.out.print(letter + " ");
        letter++;
      }
        //print alphabet reverse order
        letter='z';
        while (letter>='a'){
            System.out.print(letter + " ");
            letter--;
        }
    }
}