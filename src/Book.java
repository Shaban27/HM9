import java.util.Objects;

public class Book {
    private final String name;
    private int publicationYear;
    private final Author author;
    public Book(String name, int publicationYear, Author author) {
        this.name = name;
        this.publicationYear = publicationYear;
        this.author = author;
    }


    public void setPublicationYear(int publicationYear) {
        if (publicationYear < 1985 || publicationYear > 2050) {
            System.out.println("Invalid publishing year parameter: " + publicationYear);
            return;
        }
        this.publicationYear = publicationYear;
    }
 public String getName() { return name;
}   public int getPublicationYear() {   return publicationYear;
            }
    public Author getAuthor() {return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, publicationYear, author);
    }

    public String toString() {
        return "Book{" +"name='" + name + '\'' +", publicationYear=" + publicationYear +", author='" + author + '\'' +'}';

    }
      }




