package Baitap;

public class Books {

    private int id;
    private String author;
    private boolean bookType;
    private int publishedYear;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isBookType() {
        return bookType;
    }

    public void setBookType(boolean bookType) {
        this.bookType = bookType;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", bookType=" + bookType +
                ", publishedYear=" + publishedYear +
                '}';
    }
}
