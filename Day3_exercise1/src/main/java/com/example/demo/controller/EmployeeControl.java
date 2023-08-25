package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.EmployeeDetails;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeControl {

	@Autowired
	EmployeeService es;
	
	@PostMapping("addEmployee")
	public List<EmployeeDetails> add( @RequestBody List<EmployeeDetails> ed)
	{
		return es.saveinfo(ed);
	}
	@GetMapping("showEmployee")
	public List<EmployeeDetails> show()
	{
		return es.showinfo();
	}
	@PutMapping("update")
	public EmployeeDetails modify(@RequestBody EmployeeDetails ss)
	{  
		return es.changeInfo(ss);
	}
	@DeleteMapping("deletedetail")
	public String del(@RequestBody EmployeeDetails ss)
	{
		es.deleteinfo(ss);
		return "deleted successfully";
	}
	@DeleteMapping("DelById/{id}")
	public void DelById(@PathVariable int id )
	{
		es.deletebyid(id);
	}
	@DeleteMapping("DelStudentParam")
	public void DelParam(@RequestParam int id )
	{
		es.deletepid(id);
	}
	@GetMapping("ShowById/{id}")
	public void showbyid(@PathVariable int id)
	{
		es.showbyid(id);
	}
}