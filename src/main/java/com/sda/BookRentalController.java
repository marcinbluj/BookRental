package com.sda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookRentalController {

    @Autowired
    BookRentalService bookRentalService;

    @RequestMapping
    public List<Book> getAllCars() {
        return bookRentalService.getBooks();
    }

    @RequestMapping("/author/{author}")
    public List<Book> getBookByAuthor(@PathVariable("author") String author) {
        return bookRentalService.getBooksByAuthor(author);
    }

    @RequestMapping("/id/{id}")
    public List<Book> getBookById(@PathVariable("id") String id) {
        return bookRentalService.getBooksById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addBook(@RequestBody Book book) {
        bookRentalService.add(book);
    }

    @RequestMapping(value = "/id/{id}", method = RequestMethod.DELETE)
    public void removeBook(@PathVariable("id") String id) {
        bookRentalService.remove(id);
    }

    @RequestMapping(value = "/id/{id}", method = RequestMethod.PUT)
    public void putBook(@PathVariable("id") Book book) {
        bookRentalService.put(book);
    }
}

