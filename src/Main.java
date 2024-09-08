public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Стивен", "Кинг");
        Book book1 = new Book("Оно",author1.getFirstName()+" "+author1.getLastName(),1986);
        Author author2 = new Author("Александр", "Пушкин");
        Book book2 = new Book("Дубровский",author2.getFirstName()+" "+author2.getLastName(),1832 );
        book2.setYearRelease(1833);

    }
}