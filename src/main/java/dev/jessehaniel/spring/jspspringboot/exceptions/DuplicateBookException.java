package dev.jessehaniel.spring.jspspringboot.exceptions;

import dev.jessehaniel.spring.jspspringboot.dto.Book;
import lombok.Getter;

@Getter
public class DuplicateBookException extends RuntimeException {
    private final Book book;

    public DuplicateBookException(Book book) {
        this.book = book;
    }
}
