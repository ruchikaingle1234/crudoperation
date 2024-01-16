package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.StudentEntity;
import com.example.repo.StudentRepo;

@RestController
public class StudentController {

	@Autowired
	private StudentRepo repo;
	

//	
	@PostMapping("/save")
	public StudentEntity savedata(@RequestBody StudentEntity s)
	{
		return repo.save(s);
	}
	
	@GetMapping("/getall")
	public List< StudentEntity> getall()
	{
		return repo.findAll();
	}
	
	@PutMapping("/update")
	public  StudentEntity updatedata(@RequestBody  StudentEntity s)
	{
		return repo.save(s);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deletem(@PathVariable int id)
	{
		 repo.deleteById(id);
	}
	
	
	@GetMapping("/getbyid/{id}")
	public Optional< StudentEntity> getid(@PathVariable int id)
	{
		return repo.findById(id);
	}
	
	@GetMapping("/count")
	public long getcount()
	{
		return repo.count();
	}
}
