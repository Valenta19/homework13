import java.util.Objects;

public class Book {
    private final String bookTitle;
    private int yearBook;
    private final Author author;

    public Book(String bookTitle, Author author, int yearBook) {

        this.bookTitle = bookTitle;
        this.yearBook = yearBook;
        this.author = author;

    }

    public void setYearBooks(int yearBook) {
        this.yearBook = yearBook;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearBook == book.yearBook && Objects.equals(bookTitle, book.bookTitle) && Objects.equals(author, book.author);
    }

    public String toString() {
        return "Book{" +
                "bookTitle ='" + bookTitle + '\'' +
                ", author=" + author + '\'' +
                ", yearBook =" + yearBook +
                '}';
    }
}
