package com.project.erp_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.erp_backend.entities.Supplier;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long>{

}
