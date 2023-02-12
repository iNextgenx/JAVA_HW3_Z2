public class BmiService {
    // ИМТ = m/h2, где: m — масса тела в килограммах, h — рост в метрах
    public double calculate(double mass, double height) {
        /*
        bmi - ИМТ
        mass - масса тела в кг
        height - рост в метрах
         */
        double bmi;
        bmi = mass / (height * height);
        return bmi;
    }
}
