public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        // метод ([масса тела в кг], [рост в метрах])
        System.out.println("Индекс массы тела равен " + (int) service.calculate(98, 1.87));
    }
}