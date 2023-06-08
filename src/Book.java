public class Book {
    private String book;
    private Author author;
    private int year;

    public Book(String book, Author author, int year) {
        this.book = book;
        this.author = author;
        this.year = year;
    }

    public String getBook() {
        return this.book;
    }

    public Author getAuthor() {
        return author;
    }
    public int getYear(){
        return year;
    }

    public void setYear(String book) {
        this.year = year;
    }
}
