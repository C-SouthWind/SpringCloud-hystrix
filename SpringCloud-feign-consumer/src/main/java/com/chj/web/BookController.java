package com.chj.web;

import com.chj.model.Book;
import com.chj.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ：chj
 * @date ：Created in 2020/5/5 16:51
 * @params :
 */
@RestController
public class BookController {
    @Autowired
    private IBookService bookService;

    @GetMapping("/ConBookAll")
    public List<Book> selectAll(){
        return bookService.selectAll();
    }
}
