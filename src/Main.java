public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.87; // Рост
        double weight = 98; // Вес
        double bmi = service.calculate(height, weight);
        int index = (int) bmi;
        System.out.println(index);
    }
}
