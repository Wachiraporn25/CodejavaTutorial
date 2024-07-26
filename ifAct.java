import java.util.Scanner;
public class ifAct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int score = in.nextInt();
        if (score > 60) {
            System.out.println("You are pass");
        } else {
            System.out.println("You are not pass");
        }
    }
}
