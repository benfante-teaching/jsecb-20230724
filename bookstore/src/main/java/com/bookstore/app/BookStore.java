package com.bookstore.app;

import java.math.BigDecimal;

import com.bookstore.model.Book;

public class BookStore {
    public static void main(String[] args) {
        Book book1 = new Book(0, "Dieci Piccoli Indiani", "Agatha Christie");
		Book book2 = new Book(1, "Assassinio sull'Orient Express", "Agatha Christie", new BigDecimal("10.50"));
		Book book3 = new Book(2, "Herry Potter", "J.K. Rowling", new BigDecimal(15.45));

		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(book3);
    }
}