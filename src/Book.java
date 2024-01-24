import java.util.Objects;

public class Book {
    private final String name;
    private final Author author;
    private int publishingYear;
    public Book (String name, Author author, int publishingYear) {
        this.name = name;
        this.author = author;
        this.publishingYear = publishingYear;
    }
    public String getName() {
        return name;
    }
    public Author getAuthor() {
        return author;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Book book = (Book) other;
        return publishingYear == book.publishingYear && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }
    @Override
    public int hashCode () {
        return java.util.Objects.hash(name, author, publishingYear);
    }
    @Override
    public String toString() {
        return "Book{" +
                "name = " + name +
                ", publishingYear = " + publishingYear +
                ", author = " + author +
                "}";
    }
}
