package com.chainsys.springmvc.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chainsys.springmvc.dao.EmployeeDao;
import com.chainsys.springmvc.pojo.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @GetMapping("/list")
	public String getAllEmployees(Model model) {
		List<Employee> emplist = EmployeeDao.getAllEmployee();
		model.addAttribute("allemployees",emplist);
		return "list-employees";
	}
    @GetMapping("/addform")
    public String showAddForm(Model model)
    {
    	Employee theEmployee=new Employee();
    	model.addAttribute("addemployee",theEmployee);
    	return "add-employee-form";
    }
    @PostMapping("/add")
	public String addNewEmployees(@ModelAttribute("addemployee") Employee theEmployee) {
        EmployeeDao.insertEmployee(theEmployee);	
		return "redirect:/employee/list";
	}
    @GetMapping("/updateform")
    public String showUpdateForm(@RequestParam("empid") int id,Model model)
    {
    	Employee theEmployee=EmployeeDao.getEmployeeById(id);
    	model.addAttribute("updateemployee",theEmployee);
    	return "update-employee-form";
    }
    @PostMapping("/updateemp")
	public String updateEmployees(@ModelAttribute("updateemployee") Employee theEmployee) {
		EmployeeDao.updateEmployee(theEmployee);
    	return "redirect:/employee/list";
	}
    @GetMapping("/deleteemployee")
	public String deleteEmployees(@RequestParam("empid") int id) {
    	EmployeeDao.deleteEmployee(id);
		return "redirect:/employee/list";
	}
    @GetMapping("/findEmployeeById")
	public String findEmployeeById(@RequestParam("empid") int id,Model model) {
    	Employee theEmployee=EmployeeDao.getEmployeeById(id);
    	model.addAttribute("findEmployeeById",theEmployee);
    	return "find-employee-by-id-form";
	}
}
