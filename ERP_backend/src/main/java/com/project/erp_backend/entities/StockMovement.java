package com.project.erp_backend.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.project.erp_backend.enums.TypeStockMvt;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockMovement extends AbstractEntity {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private LocalDate stockMovementDate;
	
	private int quantity;
	
	@ManyToOne
	private Product product;
	
	private TypeStockMvt stockMovementType;

}
