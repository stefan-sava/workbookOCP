package ch45.ex1;

public class TemperatureConverter {
    public static int toFahrenheit(double temperature) {
        return (int) (temperature * 1.8 + 32);
    }
    public static int toCelsius(double temperature) {
        return (int) ((temperature - 32) * 0.55555555555);
    }
}
