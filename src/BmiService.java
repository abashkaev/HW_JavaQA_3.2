public class BmiService {
    public double calculate(double hieght, double wieght) {
        double hieght_squared = hieght * hieght;
        double bmi = wieght / hieght_squared;
        return bmi;
    }
}
