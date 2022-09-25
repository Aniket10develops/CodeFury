package com.ishika.ProductManager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
public interface LoginRepository extends JpaRepository<Employee, Long>{
	
	Employee findByUsername(String username);
 
}