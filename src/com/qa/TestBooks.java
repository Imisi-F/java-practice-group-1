package com.qa;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class TestBooks {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Library l1 = new Library("National Library", "Canada", 2000, books);
        String[] author1 = {"JK Rowling"};
        Book book1 = new Book("Harry Potter", author1, 21.50);
        String[] author2 = {"William Shakespeare"};
        Book book2 = new Book("Romeo and Juliette", author2, 2.75);
        String[] author3 = {"Jack Sparrow", "Will Turner"};
        Book book3 = new Book("Pirates", author3, 109);

        books.add(book1);
        books.add(book2);
        books.add(book3);
        System.out.println(l1);
//        for (Book b : books) {
//            System.out.println(b.toString());
//        }
    }
}
