package com.nf147.bookstore_ssm.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:spring-root.xml")
public class BookDAOTest {

    @Autowired
    BookDAO bookDAO;

    @Test
    public void getById() {
        System.out.println(bookDAO.getById(2));
    }

    @Test
    public void listAll() {
        System.out.println(bookDAO.listAll());
    }
}