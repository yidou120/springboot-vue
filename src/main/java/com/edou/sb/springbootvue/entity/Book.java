package com.edou.sb.springbootvue.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @ClassName Book
 * @Description Book实体类
 * @Author 中森明菜
 * @Date 2020/3/28 16:29
 * @Version 1.0
 */
@Entity
@Data
public class Book {
    @Id
    private Integer id;

    private String name;

    private String author;
}
