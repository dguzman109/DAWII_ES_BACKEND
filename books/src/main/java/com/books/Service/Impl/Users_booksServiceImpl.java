package com.books.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.books.Model.Users_books;
import com.books.Repository.IUsers_booksRepo;
import com.books.Service.IUsers_booksService;

@Service
public class Users_booksServiceImpl implements IUsers_booksService {

	@Autowired
	IUsers_booksRepo repo;

	@Override
	public List<Users_books> findAll() {
		return repo.findAll();
	}

	@Override
	public Users_books findById(int id) {
		 return repo.findById(id).orElseThrow();
	}

	@Override
	public Users_books save(Users_books users_books) {
		return repo.save(users_books);
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
