package com.edou.sb.springbootvue.controller;

import com.edou.sb.springbootvue.entity.Book;
import com.edou.sb.springbootvue.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName BookController
 * @Description Book 控制层
 * @Author 中森明菜
 * @Date 2020/3/28 16:33
 * @Version 1.0
 */
@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/findAll")
    public List<Book> list(){
        List<Book> bookList = bookRepository.findAll();
        return bookList;
    }
}
