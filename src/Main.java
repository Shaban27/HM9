import java.time.LocalDate;

public class Main {
       public static void main(String[] args) {
        var author1 = new Author("King", "Stiven");
        var author2 = new Author("Allan", "Adgard");
        var book1 = new Book("King", 1978, author1);
        var book = new Book("Adgard", 1922, author2);


        System.out.println(author1);
        System.out.println(book);
        book.setPublicationYear (LocalDate.now().getYear());
        System.out.println(book1);
        System.out.println(book.hashCode() == book1.hashCode());
    }
    }
