package com.project.erp_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.erp_backend.entities.SubAssembly;

@Repository
public interface SubAssemblyRepository extends JpaRepository<SubAssembly, Long>{

}
