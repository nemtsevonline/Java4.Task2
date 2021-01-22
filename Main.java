public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
       double Bmi = service.calculate(101.0,1.81);
        System.out.println(Bmi);
    }
}