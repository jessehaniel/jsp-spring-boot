package dev.jessehaniel.spring.jspspringboot.repository;

import dev.jessehaniel.spring.jspspringboot.repository.model.BookData;
import java.util.Collection;
import java.util.Optional;

public interface BookRepository {
    Collection<BookData> findAll();

    Optional<BookData> findById(String isbn);

    BookData add(BookData book);
}
