package com.myspring.books;

import java.text.DateFormat;
import com.myspring.dao.BooksDao;
import com.myspring.model.Books;

import java.util.Date;
import java.util.Locale;
import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@Autowired
	BooksDao booksdao;
	
	@RequestMapping(value="/")
	public String myMeth()
	{
	return "home";
	}
	
	@RequestMapping(value="/addbook")
	public String saveBooks(Model model,@ModelAttribute Books book) {
		
		model.addAttribute("book",book);
		booksdao.saveBook(book);
		
		return "output";
	}
	@RequestMapping(value="/deletebook")
	public String deleteBook() {
		return "delete";

	}
	@RequestMapping(value="/deletebook1")
	public String deleteBook(Model model, @RequestParam("book_id") String book_id ) {
		
		String bookid=book_id;
		booksdao.deleteBook(bookid);
	
		return "output";}
	
//}
	@RequestMapping(value="/updatebook")
	public String updateBook() {
		return "update";
		}

	@RequestMapping(value = "/updatebook1") 
	public String updateBooks(Model model,@ModelAttribute Books book) {

		
		booksdao.updateBook(book);

		return "output"; 
	}

	@RequestMapping(value="/displaybook")
	 public String RetreiveAll(Model model) {
		  ArrayList<Books> res = booksdao.getallBooks();
		  model.addAttribute("displayList", res);
		  return "display";
	  }
	@RequestMapping(value="/searchbook")
	public String searchBook() {
		return "search";
		}
	@RequestMapping(value="/searchbook1")
	public String aBook(Model model,@RequestParam("book_id") String book_id) {
		Books b=booksdao.searchBook(book_id);
		model.addAttribute("rescue", b);
		return "dispsearch";
		}
}
