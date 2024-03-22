package com.books.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "addresses")
public class Addresses {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_id;

    private String street;

    private String city;

    private String state;

}
