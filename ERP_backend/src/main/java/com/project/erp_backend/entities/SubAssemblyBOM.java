package com.project.erp_backend.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubAssemblyBOM extends AbstractEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "product_id")
	Product product;

	@ManyToOne
	@JoinColumn(name = "subAssembly_id")
	SubAssembly subAssembly;

	int quantity;

}
