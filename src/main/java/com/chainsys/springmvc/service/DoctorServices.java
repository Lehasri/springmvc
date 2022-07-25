package com.chainsys.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chainsys.springmvc.pojo.Doctor;
import com.chainsys.springmvc.repository.DoctorRepository;



@RestController
public class DoctorServices {
	@Autowired
	private DoctorRepository repo;
	
//	@Bean
//	public void setRepo(DoctorRepository repo) {
//		this.repo = repo;
//	}
	
	@GetMapping("/getdoctor")
	public Doctor getDoctor(int id) {
		return repo.findById(id);
	}
	@DeleteMapping("/deletedoctor")
	public String deleteDoctor(int id) {
		 repo.deleteById(id);
		 return "redirect:/getalldoctors";
	}
	@PostMapping(value = "/newdoctor", consumes = "application/json" )
	// we need give from where to read data from the HTTP request and also the content type ("application/json")  
	public String addDoctor(@RequestBody Doctor dr)
	{
	 repo.save(dr);
	 return "redirect:/getalldoctors";
	 
	}
	@PostMapping(value = "/modifydoctor", consumes = "application/json" )
	public String modifyDoctor(@RequestBody Doctor dr)
	{
	 repo.save(dr);
	 return "redirect:/getalldoctors";
	 
	}
	@GetMapping("/getalldoctors")
	public List<Doctor> getDoctors(){
		return repo.findAll();
	}  
}
