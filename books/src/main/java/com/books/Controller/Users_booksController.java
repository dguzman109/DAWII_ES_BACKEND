package com.books.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.books.Model.Users_books;
import com.books.Service.IUsers_booksService;

@RestController
@RequestMapping("/api/users_books")
public class Users_booksController {
	
	@Autowired
	private IUsers_booksService service;

    @GetMapping
    public List<Users_books> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Users_books findById(@PathVariable("id") int id) {
        return service.findById(id);
    }

    @PostMapping
    public Users_books save(@RequestBody Users_books users_books) {
        return service.save(users_books);
    }

    @PutMapping("/{id}")
    public Users_books update(@PathVariable("id") int id, @RequestBody Users_books users_books) {
    	//product.setId(id);
        return service.save(users_books);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") int id) {
        service.deleteById(id);
    }

    @DeleteMapping
    public void deleteAll() {
        service.deleteAll();
    }

}
