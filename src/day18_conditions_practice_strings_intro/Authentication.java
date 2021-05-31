package day18_conditions_practice_strings_intro;

public class Authentication {
    public static void main(String[] args) {
        int explast4SSN=1234;
        int expPinCode =4321;

        int lase4ssn=1234;
        int pinCode =4321;

        if (lase4ssn ==explast4SSN && pinCode ==expPinCode){
            System.out.println(" Authentication successful");
        }else {
            System.out.println(" Authentication unsuccessful");
            if (lase4ssn != explast4SSN){
                System.out.println(" Lase 4 SSN number is incorrect");
            }
            if (expPinCode != pinCode){
                System.out.println("Pin code is incorrect");
            }
        }
    }
}
