import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int year;

    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {

        this.year = year;
    }

    public String toString() {
        return "Книга " + name + " " + this.author.toString() + " " + year + " года публикации";
    }

    public boolean equals(Book book) {
        return this.name.equals(name) && this.author.equals(book.author) && this.year == book.year;
    }


    public int hashCode() {
        return Objects.hash(name, author, year);
    }
}
