package com.cog.SpringBoot.rpository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cog.SpringBoot.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
