package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Book;

public interface BookService {

	Boolean save(Book Book);

	List<Book> findAll();

}
