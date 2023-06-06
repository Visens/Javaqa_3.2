public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        float index = service.calculate(73, 1.77F);
        System.out.println("Индекс массы тела: " + (int)index);
    }

}
