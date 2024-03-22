package com.books.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.books.Model.Reviews;

public interface IReviewsRepo extends JpaRepository<Reviews, Integer> {

}
