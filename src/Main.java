import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        var author1 = new Author("King", "Stiven");
        var author2 = new Author("Allan", "Adgard");
        var book1 = new Book("King", 1978, "Author");
        var book = new Book("Adgard", 1922, "Author");
        System.out.println(author2);
        System.out.println(book);
        book.setpublicationYear (LocalDate.now().getYear());
        System.out.println(book1);
    }
    }
