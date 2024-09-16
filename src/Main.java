public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Стивен", "Кинг");
        Book book1 = new Book("Оно", author1.toSting(), 1986);
        Author author2 = new Author("Александр", "Пушкин");
        Book book2 = new Book("Дубровский", author2.toSting(), 1832);
        Book book3 = new Book("Страна радости", author1.toSting(), 2013);
        Author author3 = new Author("Стивен","Кинг");
        book2.setYearRelease(1833);
        System.out.println(book1.equals(book3));
        System.out.println(author1.equals(author3));

    }
}