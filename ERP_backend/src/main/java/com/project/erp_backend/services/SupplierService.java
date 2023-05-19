package com.project.erp_backend.services;

import java.util.List;

import com.project.erp_backend.dto.SupplierDto;

public interface SupplierService {

	public String addSupplier(SupplierDto supplierDto);

	public List<SupplierDto> getAllSuppliers();

}
