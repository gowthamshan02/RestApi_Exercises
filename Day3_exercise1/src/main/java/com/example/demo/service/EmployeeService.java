package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.EmployeeDetails;
import com.example.demo.repository.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo er;
	
	public List<EmployeeDetails> saveinfo(List<EmployeeDetails> ed)
	{
		return er.saveAll(ed);
	}
	public List<EmployeeDetails> showinfo()
	{
		return er.findAll();
	}
	public EmployeeDetails changeInfo(EmployeeDetails ss) {
		return er.saveAndFlush(ss);
	}
	 public void deleteinfo(EmployeeDetails ss)
	    {
	    	er.delete(ss);	
	    }
	    public void deletebyid(int id) 
	    {
	    	er.deleteById(id);
	    }
	    public void deletepid(int id) 
	    {
	   	er.deleteById(id);
	   }
	    public Optional<EmployeeDetails> showbyid(int id)
	    {
	    	return er.findById(id);
	    }
}