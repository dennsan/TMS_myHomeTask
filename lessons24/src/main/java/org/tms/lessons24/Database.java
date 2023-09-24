package org.tms.lessons24;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

public class Database {
    private static List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        book.setId(UUID.randomUUID());
        books.add(book);
    }

    public List<Book> getByAuthor(String author) {

        if (author == null || author.isBlank()) {
            return books;
        }
        return books.stream()
                .filter(book -> author.equals(book.getAuthor()))
                .collect(Collectors.toList());

    }

    public void delete(UUID id){
        Optional<Book> first = books.stream()
                .filter(book -> book.getId().equals(id))
                .findFirst();
        first.ifPresent(book -> books.remove(book));
    }

}
