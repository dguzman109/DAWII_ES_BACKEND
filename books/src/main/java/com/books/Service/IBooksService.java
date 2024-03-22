package com.books.Service;

import java.util.List;

import com.books.Model.Books;

public interface IBooksService {
	
	List<Books> findAll();

    List<Books> findByName(String title);

    Books findById(int id);

    Books save(Books books);

    void deleteById(int id);

    void deleteAll();

}
