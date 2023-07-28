package com.bookstore.model;

import java.math.BigDecimal;
import java.util.Arrays;

public class Book {
    private long id;
    private String title;
    private Author[] authors;
    private BigDecimal price;

    public Book(long id, String title, Author[] authors) {
        this.id = id;
        this.title = title;
        this.authors = authors;
        this.price = BigDecimal.ZERO;
    }

    public Book(long id, String title, Author[] authors, BigDecimal price) {
        this.id = id;
        this.title = title;
        this.authors = authors;
        this.price = price;
    }

    public void addAuthor(Author author) {
        Author[] newAuthors = Arrays.copyOf(authors, authors.length + 1);
        newAuthors[newAuthors.length - 1] = author;
        this.authors = newAuthors;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", title=" + title + ", author=" + Arrays.toString(authors) + ", price=" + price + "]";
    }

}