public class ExNo1 {
    public static void main(String[] args) {
        int n = 100;
        System.out.println("An even integer is:");
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
