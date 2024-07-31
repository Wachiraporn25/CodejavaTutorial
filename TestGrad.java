import java.util.Scanner;
public class TestGrad {
    public static void main(String[] args) {
       int score;
       Scanner in = new Scanner(System.in) ;
       System.out.print("Enter your score : ");
       score = in.nextInt();
       if (score < 50){
        System.out.println("Your geade is F .");
       }else if(score < 60){
        System.out.println("Your geade is D .");
       }else if(score < 70){
        System.out.println("Your geade is C .");
       }else if(score < 80){
        System.out.println("Your geade is B .");
       }else if(score <= 100){
        System.out.println("Your geade is A .");
       }else {
            System.out.println("Invalid score. ");
       }
    }
}
