package com.chj.web;

import com.chj.model.Book;
import com.chj.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ：chj
 * @date ：Created in 2020/5/5 14:50
 * @params :
 */
@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/ProBookAll")
    public List<Book> selectAll() throws Exception {
        List<Book> books = bookService.selectAll();
        if (books.size()>0) {
            throw new Exception("故意异常");
        }
        return books;
    }
}
