package com.damo;

import java.util.ArrayList;
import java.util.List;

public class BookImpl implements IBook {
    private List<Book> books;

    public BookImpl(){
        books = new ArrayList<Book>();
        books.add(new Book(1, "Java"));
        books.add(new Book(2, "Python"));
        books.add(new Book(3, "Android"));
    }
    public List<Book> getBooks() {
        return books;
    }

    public Book getBookIsbn(int isbn) {
        return books.get(isbn);
    }

    public void save(Book book) {
        books.add(book);
    }

    public void delete(Book book) {
        books.remove(book);
    }
}
