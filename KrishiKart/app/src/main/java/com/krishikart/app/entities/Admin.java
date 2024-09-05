package com.krishikart.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class Admin {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	@NotBlank(message = "please provide username")
	private String username;
	
	@Column(nullable = false)
	@NotBlank(message = "please provide firstname")
	private String firstName;
	
	@Column(nullable = false)
	@NotBlank(message = "please provide lastname")
	private String lastName;
	
	@Column(nullable = false, unique = true)
	@NotBlank(message = "please provide email")
	private String email;
	
	@Column(nullable = false, length = 30)
	@NotBlank(message = "please provide password")
	private String password;

}
