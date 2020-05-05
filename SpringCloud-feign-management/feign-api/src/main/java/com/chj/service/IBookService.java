package com.chj.service;

import com.chj.fallback.FallbackService;
import com.chj.model.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author ：chj
 * @date ：Created in 2020/5/5 16:11
 * @params :
 */
@FeignClient(value = "book-provider",fallbackFactory = FallbackService.class)
public interface IBookService {
    /** 方法描述 
    * @Description: 消费者调用生产者的方法
    * @Param: []
    * @return: java.util.List<com.chj.model.Book>
    * @Author: chj
    * @Date: 2020/5/5
    */
    @GetMapping("/ProBookAll")
    List<Book> selectAll();
}
