package com.project.erp_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.erp_backend.entities.SupplierOrder;

@Repository
public interface SupplierOrderRepository extends JpaRepository<SupplierOrder, Long>{

}
