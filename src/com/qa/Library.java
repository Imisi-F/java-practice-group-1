package com.qa;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {
    private String name;
    private String location;
    private int size;
    private ArrayList<Book>books;
    public Library (String name, String location, int size, ArrayList<Book> books) {
        this.name = name;
        this.location = location;
        this.size = size;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
    public int totalNoOfBooks(){
        return this.books.size();
    }
    public void addBook(Book b) {
        this.books.add(b);
    }
    public void removeBook(Book b) {
        this.books.remove(b);
    }

    @Override
    public String toString() {
        return "Name: " + name + " Location: " + location + " Size: " + size + books;
    }
}
