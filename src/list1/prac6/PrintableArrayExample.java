package list1.prac6;
interface Printable {
    void print();
}
class Book implements Printable {
    private String title;
    private String author;
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    @Override
    public void print() {
        System.out.println("Книга: " + title);
        System.out.println("Автор: " + author);
    }
}
class Magazine implements Printable {
    private String name;
    private int issueNumber;
    public Magazine(String name, int issueNumber) {
        this.name = name;
        this.issueNumber = issueNumber;
    }
    @Override
    public void print() {
        System.out.println("Журнал: " + name);
        System.out.println("Номер выпуска: " + issueNumber);
    }
}
public class PrintableArrayExample {
    public static void main(String[] args) {
        Printable[] printableItems = new Printable[4];
        printableItems[0] = new Book("Война и мир", "Лев Толстой");
        printableItems[1] = new Magazine("National Geographic", 123);
        printableItems[2] = new Book("Преступление и наказание", "Федор Достоевский");
        printableItems[3] = new Magazine("Time", 456);
        for (Printable item : printableItems) {
            item.print();
            System.out.println();
        }
    }
}