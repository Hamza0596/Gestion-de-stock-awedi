package com.project.erp_backend.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.project.erp_backend.enums.OrderStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SupplierOrder extends AbstractEntity {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	private String code;

	private LocalDateTime OrderDate;

	@ManyToOne
	private Supplier supplier;
	
	private OrderStatus orderStatus;

	

}
