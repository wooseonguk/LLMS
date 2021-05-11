package com.lms.controller.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lms.models.Book;
import com.lms.services.LmsService;





@RestController
public class MainRestController {

	@Autowired
	LmsService lmsService;
	
	@GetMapping(value="/")
	public String hello() {
		return "Hello World";
	}
	
	@GetMapping("/findAllBooks")
	public Collection<Book> getAllBook(){
		return lmsService.findAllBooks();
	}
}
