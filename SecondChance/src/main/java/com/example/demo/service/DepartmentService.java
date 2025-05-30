package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Department;
import com.example.demo.repo.DepartmentRepo;

import jakarta.persistence.EntityNotFoundException;

public class DepartmentService {
	@Autowired
	private DepartmentRepo repo;
	
	public List<Department> getDepts(){
		return repo.findAll();
	}
	
	public Department getDept(int id) {
		if(repo.findById(id).isEmpty()) {
			throw new EntityNotFoundException("Department not found");
		}
		return repo.findById(id).get();
	}
}
