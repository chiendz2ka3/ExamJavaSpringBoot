package com.example.demo.service.inter;

import com.example.demo.Entities.BookEntity;

import java.util.List;

public interface BookInterface {
    public Boolean AaddMewBook(BookEntity data);
    public List<BookEntity> listResult();
}
