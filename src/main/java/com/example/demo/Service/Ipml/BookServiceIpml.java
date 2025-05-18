package com.example.demo.Service.Ipml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Book;
import com.example.demo.Repository.BookRepository;
import com.example.demo.Service.BookService;


@Service
public class BookServiceIpml implements BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookServiceIpml(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    public List<Book> findAll() {
     
        return bookRepository.findAll();
    }

  
    public Boolean save(Book Book) {
        Book savedBook = bookRepository.save(Book);
        if (savedBook != null) {
            return true;
        }
        return false;
    }
}