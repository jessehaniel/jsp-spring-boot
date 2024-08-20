package dev.jessehaniel.spring.jspspringboot.service;

import dev.jessehaniel.spring.jspspringboot.dto.Book;
import java.util.Collection;

public interface BookService {
    Collection<Book> getBooks();
    Book addBook(Book book);
}
