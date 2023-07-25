package com.qa;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Book {
    private String name;
    private String[] author;
    private double price;

    public Book(String name, String[] author, double price ) {
        this.name = name;
        this.author = author;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public String[] getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String[] author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Author(s): " + Arrays.toString(author) + " Price: " + price;
    }
}
