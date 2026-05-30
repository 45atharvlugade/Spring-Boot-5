package com.ganesh.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
	// You Need to Use the RequiredArgsConstrcture  for this as you are using the lombok. 
	// and on the entity which you want in the constructor on that field use the annatation on @Nonnull
public class Student {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	private String city;
	
	private Double marks;
	
	private String course;
	
	private String email;
	
	private Boolean active;

	
	
	public Student(String name, String city, Double marks, String course, String email, Boolean active) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.marks = marks;
		this.course = course;
		this.email = email;
		this.active = active;
	}
	
	

	
}
