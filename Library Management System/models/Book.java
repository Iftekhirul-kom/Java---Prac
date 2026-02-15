package models;

public class Book {
    private String id;
    private String title;
    private String author;
    private boolean isAvailable; // true if available, false if issued

    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    // Getters and Setters
    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }

    @Override
    public String toString() {
        return "Book{id='" + id + "', title='" + title + "', author='" + author + "', available=" + isAvailable + "}";
    }
}
