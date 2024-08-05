public class MonthDay {
    public static void main(String[] args) {
        String [ ] month = {"January", "February", "March", "April", "May", "July", "September", "October", "November", "December"};
        int[ ] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 30};
        for(int index = 0; index < month.length; index++){
            System.out.println(month[index]+ " hes " +days[index]+ " days. ");
        }
    }
}
