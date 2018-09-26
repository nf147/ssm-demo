package com.nf147.bookstore_ssm.service;

import com.nf147.bookstore_ssm.dao.BookDAO;
import com.nf147.bookstore_ssm.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDAO bookDAO;

    @Override
    public Book getBookById(int bookid) {
        System.out.println("开始查询...");
        // 调用了增删改的一些方法

        return bookDAO.getById(bookid);
    }

    @Override
    public int getBookCount() {
        return bookDAO.getBookCount();
    }

    @Override
    public int getBookAvgCount() {
        System.out.println("开始查询平均数目");
        return bookDAO.getBookAvg();
    }

    @Override
    public List<Book> getMaxCountTwo() {
        return bookDAO.getMaxCountTwo();
    }
}
