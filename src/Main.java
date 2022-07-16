public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double myGrowth = 171;
        double myWeight = 68;

        double bmi = service.calculate(myGrowth, myWeight);
        System.out.printf("%.1f", bmi);
    }
}
