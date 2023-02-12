public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double mass = 98;  //kilograms
        double height = 1.87; //meters
        double index = (int)service.calculate (mass, height);

        System.out.println("Индекс массы тела равен " + index);
    }
}