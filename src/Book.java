import java.util.Objects;

public class Book {
    private String titleBook;
    private String author;
    private int yearRelease;

    public Book(String titleBook, String  author, int yearRelease) {
        this.titleBook = titleBook;
        this.author = author;
        this.yearRelease = yearRelease;
    }

    public String getTitleBook() {
        return titleBook;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    @Override
    public String toString() {
        return "Книга "+titleBook+",автор "+author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearRelease == book.yearRelease && Objects.equals(titleBook, book.titleBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleBook, author, yearRelease);
    }
}
