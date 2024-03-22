package com.books.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.books.Model.Users;

public interface IUsersRepo extends JpaRepository<Users, Integer>{

}
