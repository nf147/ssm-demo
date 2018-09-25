package com.nf147.bookstore_ssm.web;


import com.nf147.bookstore_ssm.dao.BookDAO;
import com.nf147.bookstore_ssm.entity.Book;
import com.nf147.bookstore_ssm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private BookDAO bookDAO;

    @RequestMapping("")
    public ModelAndView getBook(int bookid) {
        ModelAndView mv = new ModelAndView("book_detail");
        Book book = bookService.getBookById(bookid);
        mv.addObject("book", book);
        return mv;
    }

    @RequestMapping("/inc")
    public String update(int bookid) {
        for (int i = 0; i < 10000; i++) {
            bookDAO.updateCnt(bookid);
        }
        return "book_detail";
    }
}
