package com.chj.service;

import com.chj.mapper.BookMapper;
import com.chj.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：chj
 * @date ：Created in 2020/4/27 20:12
 * @params :
 */
@Service
public class BookService {

    @Autowired
    private BookMapper bookMapper;

    /**
     * 查询所有书籍
     * @return
     */
    public List<Book> selectAll(){
        return bookMapper.selectAll();
    }

}
