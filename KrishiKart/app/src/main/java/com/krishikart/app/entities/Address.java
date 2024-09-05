package com.krishikart.app.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity @Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	@NotBlank(message = "please provide street")
    private String street;
	
	@Column(nullable = false)
	@NotBlank(message = "please provide city")
    private String city;
	
	@Column(nullable = false)
	@NotBlank(message = "please provide state")
    private String state;
	
	@Column(nullable = false)
	@NotBlank(message = "please provide postal code")
    private String postalCode;
	
	@Column(nullable = false)
	@NotBlank(message = "please provide country")
    private String country;
	
	@ManyToOne
	@JoinColumn(name="buyer_id", nullable = true)
	private Buyer buyer;
	
	@ManyToOne
	@JoinColumn(name="farmer_id", nullable = true)
	private Farmer farmer;
}
