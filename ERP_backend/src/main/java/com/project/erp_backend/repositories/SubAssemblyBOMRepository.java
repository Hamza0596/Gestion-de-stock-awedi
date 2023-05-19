package com.project.erp_backend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.erp_backend.entities.SubAssemblyBOM;

@Repository
public interface SubAssemblyBOMRepository extends JpaRepository<SubAssemblyBOM, Long> {
	
	
	@Query
	(value = "SELECT saBOM FROM SubAssemblyBOM saBOM where saBOM.subAssembly.id = :subAssemblyId")

	List<SubAssemblyBOM> findBySubAssemblyId(Long subAssemblyId);

}
