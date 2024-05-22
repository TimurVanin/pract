package list1.prac3;
public class CurrencyConverter {
    private double exchangeRate;
    public CurrencyConverter(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
    public double convert(double amount) {
        return amount * exchangeRate;
    }
    public static void main(String[] args) {
        double exchangeRateUSDToEUR = 0.85;
        CurrencyConverter converter = new CurrencyConverter(exchangeRateUSDToEUR);
        double amountInUSD = 100.0;
        double amountInEUR = converter.convert(amountInUSD);
        System.out.println(amountInUSD + " USD = " + amountInEUR + " EUR");
    }
}