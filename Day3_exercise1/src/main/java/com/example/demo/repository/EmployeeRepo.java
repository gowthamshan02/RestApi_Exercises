package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.EmployeeDetails;

public interface EmployeeRepo extends JpaRepository<EmployeeDetails, Integer>{

}