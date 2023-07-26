public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightInMeters = 1.85;
        int weightInKg = 78;
    int indexBmi = service.calculate(heightInMeters, weightInKg);
        System.out.println(indexBmi);
    }
}