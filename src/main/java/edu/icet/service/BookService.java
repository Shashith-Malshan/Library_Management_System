package edu.icet.service;

import edu.icet.Repository.BookRepository;
import edu.icet.model.entity.Book;

import java.util.List;

public class BookService {
    BookRepository bookRepository=new BookRepository();

    public void addMember(Book book) {
        bookRepository.addMember(book);
    }

    public List<Book> getAll() {
    return bookRepository.getAll();
    }

    public void removeBook(String id) {
        bookRepository.removeBook(id);    }

    public void update(Book book) {
        bookRepository.update(book);
    }
}
