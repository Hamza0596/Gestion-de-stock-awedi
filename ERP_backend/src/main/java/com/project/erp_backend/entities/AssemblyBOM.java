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
public class AssemblyBOM extends AbstractEntity {
	
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "assembly_id")
	Assembly assembly;

	@ManyToOne
	@JoinColumn(name = "subAssembly_id")
	SubAssembly subAssembly;

	int quantity;

}
