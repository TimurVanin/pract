package list1.prac6;
interface Convertable {
    double convert(double value);
}
class CelsiusToKelvinConverter implements Convertable {
    @Override
    public double convert(double celsius) {
        return celsius + 273.15;
    }
}
class CelsiusToFahrenheitConverter implements Convertable {
    @Override
    public double convert(double celsius) {
        return (celsius * 9/5) + 32;
    }
}
public class TemperatureConverter {
    public static void main(String[] args) {
        double celsiusTemperature = 25.0;
        Convertable kelvinConverter = new CelsiusToKelvinConverter();
        Convertable fahrenheitConverter = new CelsiusToFahrenheitConverter();
        double kelvinTemperature = kelvinConverter.convert(celsiusTemperature);
        double fahrenheitTemperature = fahrenheitConverter.convert(celsiusTemperature);
        System.out.println("Температура по Цельсию: " + celsiusTemperature + "°C");
        System.out.println("Температура по Кельвину: " + kelvinTemperature + "K");
        System.out.println("Температура по Фаренгейту: " + fahrenheitTemperature + "°F");
    }
}