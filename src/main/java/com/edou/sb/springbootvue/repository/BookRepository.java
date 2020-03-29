package com.edou.sb.springbootvue.repository;

import com.edou.sb.springbootvue.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,Integer> {
    List<Book> findByNameContainingOrAuthorContaining(String name,String author);
}
