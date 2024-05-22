package list1.prac9;

public class Product implements Comparable<Product> {
    private String name;
    private double price;
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    @Override
    public int compareTo(Product otherProduct) {
        return Double.compare(this.price, otherProduct.price);
    }
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1000.0);
        Product product2 = new Product("Smartphone", 800.0);
        int comparisonResult = product1.compareTo(product2);
        if (comparisonResult < 0) {
            System.out.println(product1.getName() + " is more expensive than " + product2.getName());
        } else if (comparisonResult > 0) {
            System.out.println(product1.getName() + " is cheaper than " + product2.getName());
        } else {
            System.out.println(product1.getName() + " and " + product2.getName() + " have the same price.");
        }
    }
}