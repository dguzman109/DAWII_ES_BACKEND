package com.books.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.books.Model.Books;
import com.books.Repository.IBooksRepo;
import com.books.Service.IBooksService;

@Service
public class BooksServiceImpl implements IBooksService {

	 @Autowired
	 IBooksRepo repo;

	@Override
	public List<Books> findAll() {
		return repo.findAll();
	}

	@Override
	public List<Books> findByName(String title) {
		return repo.findByName(title);
	}

	@Override
	public Books findById(int id) {
		return repo.findById(id).orElseThrow();
	}

	@Override
	public Books save(Books books) {
		return repo.save(books);
	}

	@Override
	public void deleteById(int id) {
		repo.deleteById(id);
		
	}

	@Override
	public void deleteAll() {
		repo.deleteAll();
		
	}

}
