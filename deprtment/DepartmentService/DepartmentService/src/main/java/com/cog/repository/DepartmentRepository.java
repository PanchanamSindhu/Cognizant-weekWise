package com.cog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cog.entity.Department;
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{
	
	Department findByDepartmentId(Long departmentId);

}
