package com.books.Service;

import java.util.List;

import com.books.Model.Users_books;


public interface IUsers_booksService {

	   List<Users_books> findAll();

	    Users_books findById(int id);

	    Users_books save(Users_books users_books);

	    void deleteById(int id);

	    void deleteAll();
}
