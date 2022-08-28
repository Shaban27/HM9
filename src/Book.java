public class Book {
    private final String authorName;
    private int publicationYear;
    private final String author;
    public Book(String authorName, int publicationYear, String author) {
        this.authorName = authorName;
        this.publicationYear = publicationYear;
        this.author = author;

        }
    public void setpublicationYear(int publicationYear) {
        if (publicationYear < 1985 || publicationYear > 2050) {
            System.out.println("Invalid publishing year parameter: " + publicationYear);
            return;
        }
        this.publicationYear = publicationYear;
    }
public String getAuthorName() {
    return authorName;
}
public String getAuthor (){
        return author;
}

    public int getPublicationYear() {
        return publicationYear;
    }

    public String toString() {
        return "Book{" +"authorName='" + authorName + '\'' +", publicationYear=" + publicationYear +", author='" + author + '\'' +'}';
    }
}



