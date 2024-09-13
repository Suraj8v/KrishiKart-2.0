package com.krishikart.app.entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity @Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor
public class Buyer {

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
	
	private LocalDate registeredDate;
	
	@OneToMany(mappedBy = "buyer")
	private List<Address> addresses;
	
	@OneToMany(mappedBy = "buyer")
	private List<Orders> orders;
	
	@OneToOne(mappedBy = "buyer", cascade = CascadeType.ALL)
	private BuyerCart cart;
	
}
