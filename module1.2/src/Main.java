public class Main {
    public static void main(String[] args) {
        FahrenheitToCelsius converter = new FahrenheitToCelsius();

        double value = converter.convert(1);

        System.out.println(value);
    }
}