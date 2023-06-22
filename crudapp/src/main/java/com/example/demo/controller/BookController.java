package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.repo.BookRepo;

@RestController
public class BookController {
	
		@Autowired
		private BookRepo bookRepo;
		
		
		@GetMapping
		public ResponseEntity<List<Book>> getAllBook() {
			try {
				//using the collections framework
				List<Book> bookList = new ArrayList<>();
				bookRepo.findAll().forEach(bookList::add);
				
				
				if (bookList.isEmpty()){
					return new ResponseEntity<>(HttpStatus.NO_CONTENT);
				}
				
				return new ResponseEntity<>(HttpStatus.OK);
			}catch (Exception ex){
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
		@GetMapping("/getBookById/{id}")
		public ResponseEntity<Book> getBookById(@PathVariable Long id) {
			Optional <Book> bookData = bookRepo.findById(id);
			
			if (bookData.isPresent()) {
				return new ResponseEntity<> (HttpStatus.OK);
			}
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);	
				
		}
		
		@PostMapping
		public void addBook() {
			
		}
		
		@PostMapping
		public void updateBookById() {
			
		}
		
		@DeleteMapping
		public void deleteBookById() {
			
		}
}
