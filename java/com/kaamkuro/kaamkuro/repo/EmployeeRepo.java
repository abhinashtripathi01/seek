package com.kaamkuro.kaamkuro.repo;

import com.kaamkuro.kaamkuro.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
    Optional<Employee> findByEmail(String email);
}
