package edu.icet.controller;

import edu.icet.model.entity.Book;
import edu.icet.model.entity.Member;
import edu.icet.service.BookService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("bookInfo")

public class BookController {

    BookService bookService=new BookService();

    @PostMapping("add")
    public void addBook(@RequestBody Book book){
        bookService.addMember(book);

    }




}
