public class FahrenheitToCelsius {

    public double convert(double fahrenheit) {
        // °C = (°F - 32) × 5/9

        double celsius = (fahrenheit - 32) * 5/9;
        return celsius;
    }
}
