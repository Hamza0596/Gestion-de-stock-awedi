package com.project.erp_backend.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.erp_backend.enums.Type;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubAssembly extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	private String code;

	private String designation;

	private double manufacturingCost;

	private double deliveryCost;

	private double preparationTime;

	private double manufacturingTime;

	private double waitingTime;

	private double deliveryTime;
	
	private int numberOperators;

	@Enumerated(EnumType.STRING)
	private Type type;

	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;

	@JsonIgnore
	@OneToMany(mappedBy = "subAssembly")
	Set<SubAssemblyBOM> subAssemblyProducts;

	@JsonIgnore
	@OneToMany(mappedBy = "subAssembly")
	Set<AssemblyBOM> assemblyBOMs;
}
