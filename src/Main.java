public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Mike", "Rotter");
        Author author2 = new Author("Alexey", "Reznichenko");
        Book book1 = new Book("We Envy Nothing in the World", author1, 2023);
        System.out.println("Книга называется " + book1.getBookName());
        System.out.println("Книгу написал " + book1.getAuthor());
        System.out.println("Книга издана в " + book1.getPublishingYear() + " году");
        Book book2 = new Book("Random Jokes and Giggles", author2, 2022);
        System.out.println("Книга называется " + book2.getBookName());
        System.out.println("Книгу написал " + book2.getAuthor());
        System.out.println("Книга издана в " + book2.getPublishingYear() + " году");
        book2.setPublishingYear(2024);
        System.out.println("Книга называется " + book2.getBookName());
        System.out.println("Книгу написал " + book2.getAuthor());
        System.out.println("Новая информация! Книга издана в " + book2.getPublishingYear() + " году");
    }
}