package com.books.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.books.Model.Users_books;

public interface IUsers_booksRepo extends JpaRepository<Users_books, Integer>{

}
