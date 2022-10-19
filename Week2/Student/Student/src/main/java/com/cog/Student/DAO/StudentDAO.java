package com.cog.Student.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cog.Student.entity.Student;

@Repository
public interface StudentDAO extends JpaRepository<Student, Integer>{

}
