package models;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String id;
    private String name;
    private List<String> borrowedBooks;  // List of book IDs

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    // Getters and Setters
    public String getId() { return id; }
    public String getName() { return name; }
    public List<String> getBorrowedBooks() { return borrowedBooks; }

    public boolean borrowBook(String bookId) {
        return borrowedBooks.add(bookId);
    }

    public boolean returnBook(String bookId) {
        return borrowedBooks.remove(bookId);
    }

    @Override
    public String toString() {
        return "Member{id='" + id + "', name='" + name + "', borrowed=" + borrowedBooks + "}";
    }
}
