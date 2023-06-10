import java.util.Objects;

public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String toString() {
        return "Автор: " + firstName + " " + lastName;
    }

    public boolean equals(Author author) {
        return this.firstName.equals(firstName) && this.lastName.equals(lastName);
    }

    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

}
