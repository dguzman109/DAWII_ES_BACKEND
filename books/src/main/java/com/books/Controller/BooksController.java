package com.books.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.books.Model.Books;
import com.books.Service.IBooksService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/book")
public class BooksController {
	
	@Autowired
    private IBooksService service;

    @GetMapping
    public List<Books> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Books findById(@PathVariable("id") int id) {
        return service.findById(id);
    }

    @GetMapping(params = "title")
    public List<Books> findByName(@RequestParam("title") String title) {
        return service.findByName(title);
    }

    @PostMapping
    public Books save(@RequestBody Books books) {
        return service.save(books);
    }

    @PutMapping("/{id}")
    public Books update(@PathVariable("id") int id, @RequestBody Books books) {
    	books.setId(id);
        return service.save(books);
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
