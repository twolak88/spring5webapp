package com.twolak.spring.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.twolak.spring.spring5webapp.domain.Author;
import com.twolak.spring.spring5webapp.repositories.AuthorRepository;
import com.twolak.spring.spring5webapp.repositories.BookRepository;

@Controller
public class BookController {
    
    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
    
    public BookController(BookRepository bookRepository, AuthorRepository authorRepository) {
	this.bookRepository = bookRepository;
	this.authorRepository = authorRepository;
    }

    @GetMapping("/books")
    public String getBooks(Model model) {
	
	model.addAttribute("books", bookRepository.findAll());
	
	return "books/list";
    }
    
    @GetMapping("/authors")
    public String getAuthors(Model model) {
	model.addAttribute("authors", authorRepository.findAll());
	return "authors/list";
    }
}
