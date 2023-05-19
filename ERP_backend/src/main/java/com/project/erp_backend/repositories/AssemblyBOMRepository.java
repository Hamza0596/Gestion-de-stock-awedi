package com.project.erp_backend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.erp_backend.entities.AssemblyBOM;
import com.project.erp_backend.entities.SubAssembly;

@Repository
public interface AssemblyBOMRepository extends JpaRepository<AssemblyBOM, Long> {
	
	
	@Query
	(value = "SELECT aBOM.subAssembly FROM AssemblyBOM aBOM where aBOM.assembly.id = :assemblyId")

	List<SubAssembly> findByAssemblyId(Long assemblyId);

}
