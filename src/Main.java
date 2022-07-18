public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        System.out.println("Индекс тела = " + service.calculate(80, 191));
    }
}
