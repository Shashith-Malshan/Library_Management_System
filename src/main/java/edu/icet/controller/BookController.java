package edu.icet.controller;

import edu.icet.model.entity.Book;
import edu.icet.model.entity.Member;
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

    @PostMapping("add")
    public void addBook(@RequestBody Book book){
        bookService.addMember(book);

    }




}
