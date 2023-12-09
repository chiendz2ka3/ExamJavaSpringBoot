package com.example.demo.respository;

import com.example.demo.Entities.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Book;

public interface BookRespository extends JpaRepository<BookEntity, Long> {
}
