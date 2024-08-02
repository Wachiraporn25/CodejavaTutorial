public class DemoArg {
    public static void main(String[] args) {
        System.out.println("start in main.");
        int tesetNum = 10 ;
        int total;
        dispayValue(5);
        dispayValue(tesetNum);
        dispayValue(tesetNum * 5);
        total = showSum(3, 4);
        System.out.println("total have value : "+total);
    }
    public static void dispayValue(int num){
        System.out.println("value is "+num);
    }
    public static int showSum(int x, int y){
        int sun;
        sun = x + y ;
        return sun;
        
    }
}
