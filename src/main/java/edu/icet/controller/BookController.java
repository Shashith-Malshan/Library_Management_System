package edu.icet.controller;

import edu.icet.model.entity.Book;
import edu.icet.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("bookInfo")

public class BookController {

    BookService bookService=new BookService();

    @GetMapping("all")
    public List<Book> getAll(){
       return bookService.getAll();
    }

    @GetMapping("{id}")
    public Book getBook(@PathVariable String id){
        for (Book book:bookService.getAll()){
            if(book.getId().equalsIgnoreCase(id)){
                return book;
            }
        }
        return null;
    }
    @DeleteMapping("{id}")
    public void removeBook(@PathVariable String id){
        bookService.removeBook(id);
    }


    @PostMapping("add")
    public void addBook(@RequestBody Book book){
        bookService.addMember(book);

    }
    @PutMapping("update")
    public void update(@RequestBody Book book){
        bookService.update(book);
    }






}
