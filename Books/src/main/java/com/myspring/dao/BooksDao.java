package com.myspring.dao;

import java.util.ArrayList;

import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.myspring.model.Books;;

@Component
public class BooksDao {

	@Autowired
	SessionFactory sessionfactory;
	
	@Transactional
	public void saveBook(Books book) {
		
		Session session = sessionfactory.getCurrentSession();
		session.save(book);	
	}
	
	@Transactional
	public void deleteBook(String book_id) {
		
		Session session  = sessionfactory.getCurrentSession();
		Books book=new Books();
		book.setBook_id(book_id);
		session.delete(book);
	}
	
	@Transactional
	public void updateBook(Books book) {
		
		Session session  = sessionfactory.getCurrentSession();
		Books book1 = new Books();
		book1.setBook_name(book.getBook_name());
		book1.setTitle(book.getTitle());
		book1.setAuthor(book.getAuthor());
		book1.setBook_id(book.getBook_id());
		//book2.setBook_id(book_id);
		session.update(book1);
		
	}
	@Transactional
	public ArrayList<Books> getallBooks(){
		Session session  = sessionfactory.getCurrentSession();
		ArrayList<Books> result= (ArrayList<Books>)session.createQuery("from Books").list();
		return result;
		
	}
	@Transactional
	public Books searchBook(String book_id) {
		Session session  = sessionfactory.getCurrentSession();
		Books result=(Books)session.get(Books.class,book_id);
		return result;
	}
	
}
