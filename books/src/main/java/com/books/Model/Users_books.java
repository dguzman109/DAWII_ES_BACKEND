package com.books.Model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "users_books")
public class Users_books {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_id;
    
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "book_id", referencedColumnName ="id")
    private Books books;

    private LocalDate checkout_date;

    private LocalDate return_date;

}
