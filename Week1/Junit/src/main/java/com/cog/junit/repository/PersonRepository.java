package com.cog.junit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cog.junit.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{

}
