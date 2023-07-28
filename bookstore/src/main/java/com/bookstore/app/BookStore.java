package com.bookstore.app;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

import com.bookstore.model.Book;

public class BookStore {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        System.out.print("Vuoi inserire un libro? (y/n) ");
        String again = scan.nextLine();
        while("y".equals(again)) {
            System.out.print("Inserisci l'id: ");
            long id = scan.nextLong();
            scan.nextLine();
            System.out.print("Inserisci il titolo: ");
            String title = scan.nextLine();
            System.out.print("Inserisci l'autore: ");
            String author = scan.nextLine();
            System.out.print("Inserisci il prezzo: ");
            while(!scan.hasNextBigDecimal()) {
                System.out.println("Prezzo non valido");
                scan.nextLine();
                System.out.print("Inserisci il prezzo: ");
            }
            BigDecimal price = scan.nextBigDecimal();
            scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            Book book = new Book(id, title, author, price);
            System.out.println(book);
            System.out.print("Vuoi inserire un altro libro? (y/n) ");
            again = scan.nextLine();
        }
        scan.close();
    }

    private static void printFixedBooks() {
        Book book1 = new Book(0, "Dieci Piccoli Indiani", "Agatha Christie");
		Book book2 = new Book(1, "Assassinio sull'Orient Express", "Agatha Christie", new BigDecimal("10.50"));
		Book book3 = new Book(2, "Herry Potter", "J.K. Rowling", new BigDecimal(15.45));

		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(book3);
    }
}