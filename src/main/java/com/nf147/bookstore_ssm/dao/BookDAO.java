package com.nf147.bookstore_ssm.dao;

import com.nf147.bookstore_ssm.entity.Book;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BookDAO {
    /**
     * 通过 id 获取图书
     */
    Book getById(int bookid);

    /**
     * 获取书籍数目
     */
    int countAll();

    /**
     * 获取所有图书
     */
    List<Book> listAll();

    /**
     * 获取所有图书
     */
    List<Book> listAllPager(@Param("offset") int offset, @Param("size") int size);
    
    /**
     * 新增图书
     */
    int insert(Book book);

    /**
     * 修改图书
     */
    int update(Book book);

    /**
     * 删除图书
     */
    int delete(int bookid);

}
