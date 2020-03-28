package com.edou.sb.springbootvue.repository;

import com.edou.sb.springbootvue.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
