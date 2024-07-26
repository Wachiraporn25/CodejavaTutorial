import java.util.Scanner;
public class Payroll {
    public static void main(String[] args) {
        String name;
        int hours;
        double payRate;
        double grossPay;
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name? : ");
        name = in.nextLine();
        System.out.print("Hot many hours did you work this week? : ");
        hours = in.nextInt();
        System.out.print("What is your hours pay rate? : ");
        payRate = in.nextDouble();
        grossPay = hours * payRate;
        System.out.println("Hello "+name);
        System.out.println("You gross pay is "+grossPay);
    }
}
