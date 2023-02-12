public class BmiService {
    // ИМТ = m/h2, где: m — масса тела в килограммах, h — рост в метрах
    public double calculate(double m, double h) {
        double bmi;
        bmi = m / (h * h);
        return bmi;
    }
}
