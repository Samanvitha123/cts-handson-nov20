package com.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService service;

	@RequestMapping(value = "/deleteEmployee", method = RequestMethod.POST)
	public ModelAndView deleteEmployee(@RequestParam("employeeId") int empId) {
		service.deleteEmployee(empId);
		ModelAndView mav = new ModelAndView("success", "msg", "Deleted successfully!");
		return mav;
	}
	
	@RequestMapping(value="/storeEmployee",method=RequestMethod.POST)
	public ModelAndView storeEmployee(@RequestParam("employeeId") int empId,@RequestParam("employeeName") String empName,@RequestParam("employeeSalary") double empSalary)
	{
		service.storeEmployee(new Employee(empId,empName,empSalary));
		ModelAndView mav=new ModelAndView("success","msg","Successfully added!");
	    return mav;
	}
	
	@RequestMapping(value="/addEmployee",method=RequestMethod.GET)
	public ModelAndView add()
	{
		return new ModelAndView("storeEmployee");
	}
	
	@RequestMapping(value="/delEmployee",method=RequestMethod.GET)
	public ModelAndView del()
	{
		return new ModelAndView("deleteEmployee");
	}

}
