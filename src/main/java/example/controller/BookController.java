package example.controller;

import example.model.Book;
import example.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @RequestMapping(method = RequestMethod.POST)
    public Book createBook(@RequestBody @Valid final Book book) {
        return bookRepository.save(book);
    }

    @RequestMapping(value = "/{bookId}", method = RequestMethod.GET)
    public Book getBook(@PathVariable("bookId") String bookId) {
        return bookRepository.findOne(bookId);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    @RequestMapping(value = "/{bookId}", method = RequestMethod.DELETE)
    public void deleteBook(@PathVariable("bookId") String bookId) {
        bookRepository.delete(bookId);
    }

}
