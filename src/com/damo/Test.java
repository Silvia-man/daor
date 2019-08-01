package com.damo;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        IBook bookDao = new BookImpl();

        printBooks(bookDao);

        Book book = new Book(4, "Algorithm");
        bookDao.save(book);

        printBooks(bookDao);

        bookDao.delete(book);
        printBooks(bookDao);
    }

    private static void printBooks(IBook bookDao) {
        List<Book> books = bookDao.getBooks();
        for(Book book: books) {
            System.out.println("Book: " + book.getIsbn() + " " + book.getName());
        }
    }
}
