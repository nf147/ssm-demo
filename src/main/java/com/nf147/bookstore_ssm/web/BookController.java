package com.nf147.bookstore_ssm.web;


import com.nf147.bookstore_ssm.dao.BookDAO;
import com.nf147.bookstore_ssm.entity.Book;
import com.nf147.bookstore_ssm.service.BookService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private BookDAO bookDAO;

    @RequestMapping("/book/{id}")
    public ModelAndView getBook(@PathVariable("id") int bookid) {
        ModelAndView mv = new ModelAndView("book_detail");
        Book book = bookService.getBookById(bookid);

        System.out.println(book);

        mv.addObject("book", book);
        return mv;
    }

    @RequestMapping("/books")
    public String list(Model model) {
        List<Book> books = bookDAO.listAll();

        System.out.println("总共有这些书: " + books.size());

        model.addAttribute("books", books);
        return "book_list";
    }

    @RequestMapping("/book/count")
    public String count(Model model) {
        int cnt = bookService.getBookCount();
        System.out.println(cnt);
        model.addAttribute("books", bookDAO.listAll());
        return "book_list";
    }

    @RequestMapping("/book/avg")
    public String avg(Model model) {
        System.out.println(bookService.getBookAvgCount());
        model.addAttribute("books", bookDAO.listAll());
        return "book_list";
    }

    @RequestMapping("/book/getCountMaxTwo")
    public String getCountMaxTwo(Model model){
        model.addAttribute("books", bookDAO.getMaxCountTwo());
        return "book_list";
    }
}
