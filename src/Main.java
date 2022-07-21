public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double weight = 56;
        double height = 164;

        double bmi = service.calculate(weight, height);

        System.out.println(" Индекс массы тела: " + bmi);

    }
}
