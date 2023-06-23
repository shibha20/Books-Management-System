package com.example.demo.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="Books")


//using annotations from lombok
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String title;
	
	private String author;

	
	//generating getteres and setters as STS is not recognizing lombok annotations
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
}
