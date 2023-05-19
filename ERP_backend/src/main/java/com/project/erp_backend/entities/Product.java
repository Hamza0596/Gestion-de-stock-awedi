package com.project.erp_backend.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	private String code;

	private String designation;

	private double price;

	private int leadTime;

	private int stockMin;

	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;
	
	@JsonIgnore
	@OneToMany(mappedBy = "product")
	Set<SubAssemblyBOM> subAssemblyProducts;

}
