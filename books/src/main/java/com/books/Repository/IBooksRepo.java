package com.books.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.books.Model.Books;

public interface IBooksRepo extends JpaRepository<Books, Integer> {

	@Query("SELECT p FROM Books p WHERE p.title LIKE %?1%")
    List<Books> findByName(String title);	

}
