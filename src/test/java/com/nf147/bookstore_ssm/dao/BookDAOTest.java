package com.nf147.bookstore_ssm.dao;

import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;
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

    private Logger logger = Logger.getLogger(BookDAOTest.class);

    @Test
    public void getById() {
        logger.debug(bookDAO.getById(2));
    }

    @Test
    public void listAll() {
        logger.debug(bookDAO.listAll());
    }
}