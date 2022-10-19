package com.digitalbook.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitalbook.entity.Book;
import com.digitalbook.repository.BookRepository;
import com.digitalbook.service.BookService;

/**
* 
* @author sindhu
* This is BookServiceImpl which is used for running methods from controller
* */
@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository bookRepository;
	
	@Override
	public Book saveBook(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book getBook(String title) {
		Book book = new Book();
		Optional<Book> bookOptional = bookRepository.findByTitle(title);
		if(bookOptional.isPresent()) {
			book = bookOptional.get();
		}
		return book;
	}

}
