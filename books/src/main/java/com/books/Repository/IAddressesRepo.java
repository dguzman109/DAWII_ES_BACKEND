package com.books.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.books.Model.Addresses;

public interface IAddressesRepo extends JpaRepository<Addresses, Integer>{

}
