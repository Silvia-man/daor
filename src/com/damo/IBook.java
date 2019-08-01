package com.damo;

import java.util.List;

public interface IBook {
    List<Book> getBooks();
    Book getBookIsbn(int isbn);
    void save(Book book);
    void delete(Book book);
}
