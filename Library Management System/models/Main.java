package Library Management System;

import models.Book;
import models.Member;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("B001", "Java Basics", "John Doe");
        Member member1 = new Member("M001", "Alice");

        System.out.println(book1);
        System.out.println(member1);
    }
}
