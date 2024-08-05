import java.util.Scanner;

public class PassArray {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 4;
        int [ ] number = new int[ARRAY_SIZE];
        getValue(number);
        System.out.println("Her are the number that you enterd : ");
        showArray(number);
    }
    public static void getValue(int[ ] array){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter aseies of " +array.length+ " number ");
        for(int index = 0; index < array.length; index++){
            System.out.println("Enter number " +(index + 1) + " : ");
            array[index] = in.nextInt();
        }
    }
    public static void showArray(int[ ] array){
        for(int index = 0; index < array.length; index++){
            System.out.println(array[index]+ " ");
        }
    }
}
