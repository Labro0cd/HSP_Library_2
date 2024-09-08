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
}
