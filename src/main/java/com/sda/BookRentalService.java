package com.sda;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BookRentalService {
    List<Book> books = new ArrayList<>();

    public BookRentalService() {
        books.add(new Book("Bloomsbury Publishing", "Rowling", "Harry Potter i kamień filozoficzny", "powieść", "a1"));
        books.add(new Book("Znak Horyzont", "Vance", "Elon Musk. Biografia twórcy PayPal, Tesla, SpaceX", "biografia", "b1"));
        books.add(new Book("Światowy Związek Polaków z Zagranicy", "Orwell", "Folwark zwierzęcy", "powieść", "c1"));
    }

    public List<Book> getBooks() {
        return books;
    }

    public void add(Book book) {
        books.add(book);
    }

    public void remove(String id) {
        Optional<Book> book = books.stream().filter(x -> x.getId().equals(id)).findFirst();
        book.ifPresent(x -> books.remove(x));
    }

    public List<Book> getBooksByAuthor(String author) {
        return books.stream().filter(x -> x.getAuthor().equals(author)).collect(Collectors.toList());
    }

    public List<Book> getBooksById(String id) {
        return books.stream().filter(x -> x.getId().equals(id)).collect(Collectors.toList());
    }
}
