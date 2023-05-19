package com.project.erp_backend.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.erp_backend.dto.SupplierDto;
import com.project.erp_backend.entities.Supplier;
import com.project.erp_backend.helpers.ModelMapperConverter;
import com.project.erp_backend.repositories.SupplierRepository;
import com.project.erp_backend.services.SupplierService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SupplierServiceImpl implements SupplierService {

	private final SupplierRepository repository;

	@Override
	public String addSupplier(SupplierDto supplierDto) {
		repository.save(ModelMapperConverter.map(supplierDto, Supplier.class));

		return "Le fournisseur a été ajouté avec succès";
	}

	@Override
	public List<SupplierDto> getAllSuppliers() {
		return ModelMapperConverter.mapAll(repository.findAll(), SupplierDto.class);
	}

}
