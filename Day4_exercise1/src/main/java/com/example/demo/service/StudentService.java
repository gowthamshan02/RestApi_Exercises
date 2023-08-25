package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.StudentDetails;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentService {

	@Autowired
	StudentRepo sr;
	
	//saveoneStudent
	public StudentDetails saveone(StudentDetails ss)
	{
		return sr.save(ss);
	}
	
	//SaveManystudent
	public List<StudentDetails> saveall(List<StudentDetails> ss)
	{
		return (List<StudentDetails>)sr.saveAll(ss);
	}
	
	//displayStudents
	public List<StudentDetails> showall()
	{
		return  (List<StudentDetails>)sr.findAll();
	}
	
	//updateStudents
	public StudentDetails changeone(StudentDetails ss)
	{
		return sr.saveAndFlush(ss);
	}
	
     //deleteStudents
	public void deleteone(StudentDetails ss)
	{
		sr.delete(ss);
	}
	
	
	public void deleteid(int id)
	{
	    sr.deleteById(id);
	}
	
	
	//display by id
	public Optional<StudentDetails> showbyid(int id)
	{
		return sr.findById(id);
	}
	
	public String updatebyid(int id,StudentDetails ss)
	{
		sr.saveAndFlush(ss);
		if(sr.existsById(id))
		{
			return "updated";
		}
		else
		{
			return "Enter valid id";
		}
	}
	public List<StudentDetails> sortinfo(String s){
		return sr.findAll(Sort.by(Sort.DEFAULT_DIRECTION,s));
	}
	public List<StudentDetails> getbypage(int pgno,int pgsize)
	{
		Page<StudentDetails> p = sr.findAll(PageRequest.of(pgno, pgsize));
		return p.getContent();
	}
	public List<StudentDetails> getbypage(int pgno,int pgsize,String key)
	{
		Page<StudentDetails> p = sr.findAll(PageRequest.of(pgno, pgsize,Sort.DEFAULT_DIRECTION,key));
		return p.getContent();
	}
}