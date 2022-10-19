package com.digitalbook.service;

import com.digitalbook.entity.Book;

/**
 * 
 * @author sindhu
 * This is BookService interface which used for defining book details methods
 *
 */
public interface BookService {
	public Book saveBook(Book book);

	public Book getBook(String title);

}
