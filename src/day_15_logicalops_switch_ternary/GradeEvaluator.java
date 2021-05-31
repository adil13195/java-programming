package day_15_logicalops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {
        char grad='A';
        if (grad == 'A' || grad == 'B' || grad == 'C'){
            System.out.println("pass with " + grad);
        }else if (grad == 'D'){
            System.out.println(" Qualify for retake. GRade - " + grad);
        }else if (grad == 'E' ){
            System.out.println("Fail . Grade - " + grad);
        }else {
            System.out.println("Invalid Grade - " + grad);
        }
    }
}
