package com.krishikart.app.entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity @Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor
public class Farmer {

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
	
	@Column(nullable = false, unique = true, length=12)
	@NotBlank(message = "please provide phonenumber")
	private String phone;
	
	@Column(nullable = false, length = 30)
	@NotBlank(message = "please provide password")
	private String password;
	
	@Column(nullable = false)
	@NotBlank(message = "please provide farm location")
	private String farmLocation;
	
	private LocalDate registeredDate;
	
	@OneToMany(mappedBy = "farmer")
	private List<Address> addresses;
	
	@OneToMany(mappedBy = "farmer")
	private List <Product> products;
}
