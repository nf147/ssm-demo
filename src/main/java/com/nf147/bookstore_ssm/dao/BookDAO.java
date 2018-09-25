package com.nf147.bookstore_ssm.dao;

import com.nf147.bookstore_ssm.entity.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookDAO {
    Book getBook(int bookid);
    List<Book> getAll();

    int updateCnt(int bookid);
}
