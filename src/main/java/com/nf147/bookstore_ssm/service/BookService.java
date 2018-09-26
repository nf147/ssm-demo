package com.nf147.bookstore_ssm.service;

import com.nf147.bookstore_ssm.entity.Book;

import java.util.List;

public interface BookService {
    Book getBookById(int bookid);

    int getBookCount();

    int getBookAvgCount();

    List<Book> getMaxCountTwo();
}
