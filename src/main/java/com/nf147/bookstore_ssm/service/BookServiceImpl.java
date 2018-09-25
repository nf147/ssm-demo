package com.nf147.bookstore_ssm.service;

import com.nf147.bookstore_ssm.dao.BookDAO;
import com.nf147.bookstore_ssm.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookDAO bookDAO = null;

    @Override
    public Book getBookById(int bookid) {
        System.out.println("开始查询...");
        return bookDAO.getBook(bookid);
    }
}
