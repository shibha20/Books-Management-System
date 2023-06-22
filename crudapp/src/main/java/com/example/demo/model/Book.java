package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Books")


//using annotations from lombok
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Book {

	private Long id;
	
	private String title;
	
	private String author;
}
