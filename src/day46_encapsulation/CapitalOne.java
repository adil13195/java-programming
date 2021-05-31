package day46_encapsulation;

public class CapitalOne {
    public static void main(String[] args) {
        CheckingAccount acc = new CheckingAccount();
        acc.setAccountNumber(45635456165L);
        acc.setBalance(250.5);
        acc.setAccountHolder("Adil");
        System.out.println(acc );
    }
}
