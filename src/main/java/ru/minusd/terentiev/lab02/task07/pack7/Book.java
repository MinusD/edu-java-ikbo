package pack7;

public class Book {
    private String name, author;
    private int year;

    public int getYear() {
        return this.year;
    }
    public String getName ()
    {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
