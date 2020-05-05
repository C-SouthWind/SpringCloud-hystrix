package com.chj.fallback;

import com.chj.model.Book;
import com.chj.service.IBookService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author ：chj
 * @date ：Created in 2020/5/5 17:44
 * @params :
 */
@Component
public class FallbackService implements FallbackFactory<IBookService> {
    @Override
    public IBookService create(Throwable throwable) {

        IBookService bookService = new IBookService() {
            @Override
            public List<Book> selectAll() {
                System.out.println("fallback方法");
                return null;
            }
        };
        return bookService;
    }
}























