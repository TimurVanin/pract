package list1.prac7;
public class Main {
    public static void main(String[] args) {
        Printable[] printableItems = new Printable[]{
                new Magazine("Java Magazine"),
                new Magazine("Science Today"),
                new Book("Introduction to Java"),
                new Book("History of Science"+"/"),
        };
        Book.printBooks(printableItems);
    }
}