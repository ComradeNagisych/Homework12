import java.util.Objects;

public class Author {
    private final String firstName;
    private final String lastName;
    public Author (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Author author = (Author) other;
        return Objects.equals(firstName, author.firstName) && Objects.equals(lastName, author.lastName);
    }
    @Override
    public int hashCode () {
        return Objects.hash(firstName, lastName);
    }
    @Override
    public String toString() {
        return "Author{" +
                "firstName = " + firstName +
                ", lastName = " + lastName +
                "}";
    }
}
