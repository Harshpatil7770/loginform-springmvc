package com.loginform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.loginform.model.Employee;

@Controller
public class EmployeeController {

	@RequestMapping("/details")
	public String emoloyeeLoginForm() {
		return "employee";
	}
	
	@RequestMapping(value="employeeRegister",method=RequestMethod.POST)
	public String registerEmployee(@ModelAttribute("employee") Employee employee,ModelMap model) {
		System.out.println(employee);
		ModelAndView modelandview=new ModelAndView();
		modelandview.addObject("employee",employee);
		modelandview.setViewName("regResult");
		model.addAttribute("employee",employee);
		return "regResult";
	}
}
