package list1.prac7;
public class Printable {
}
class Book extends Printable {
    private String title;
    public Book(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public static void printBooks(Printable[] printable) {
        for (Printable item : printable) {
            if (item instanceof Book) {
                Book book = (Book) item;
                System.out.println("Книга: " + book.getTitle());
            }
        }
    }
}
class Magazine extends Printable {
    private String title;
    public Magazine(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public static void printMagazines(Printable[] printable) {
        for (Printable item : printable) {
            if (item instanceof Magazine) {
                Magazine magazine = (Magazine) item;
                System.out.println("Журнал: " + magazine.getTitle());
            }
        }
    }
}
