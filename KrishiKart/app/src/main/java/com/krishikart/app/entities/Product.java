package com.krishikart.app.entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity @Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor
public class Product {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productId;

	@Column(nullable = false)
	@NotBlank(message = "please provide product name")
    private String name;
	
	@Column
    private String description;
	
	@Column(nullable = false)
	@NotBlank(message = "please provide price")
    private Double price;
	
	@Column(nullable = false)
	@NotBlank(message = "please provide quantity")
    private Integer quantity;
    
    private LocalDate addedDate;
    
    @ManyToOne
    @JoinColumn(name="farmer_id")
    private Farmer farmer;
    
    @ManyToMany(mappedBy = "products")
    private List<Orders> orders;
    
    @ManyToMany(mappedBy = "products")
    private List<BuyerCart> carts;
    
	
}
