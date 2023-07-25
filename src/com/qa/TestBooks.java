package com.qa;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class TestBooks {
    public static void main(String[] args) {
        String[] author1 = {"JK Rowling"};
        Book book1 = new Book("Harry Potter", author1, 21.50);
        String[] author2 = {"William Shakespeare"};
        Book book2 = new Book("Romeo and Juliette", author2, 2.75);
        String[] author3 = {"Jack Sparrow", "Will Turner"};
        Book book3 = new Book("Pirates", author3, 109);

        Book[] Books = {book1,book2,book3};
        for (Book b : Books) {
            System.out.println(b.toString());
        }
    }
}
