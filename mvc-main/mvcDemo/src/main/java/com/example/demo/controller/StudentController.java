package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

	
	@Autowired
	EmpService service;
	
	@RequestMapping("/")
	
	public ModelAndView  dem(ModelAndView mv){
	
		mv.setViewName("index.jsp");
//		return mv;
//		List<Employee> list = service.getEmployees();
//		mv.addObject("all",list);
		return mv;
//		return "index.jsp";
	}
	
	
	@RequestMapping("/print")
	public ModelAndView demo(@RequestParam("name") String name,ModelAndView mv)
	{
		//mv = new ModelAndView();
		mv.setViewName("welcome.jsp");
		mv.addObject("username",name);
		return mv;
		
	}
	
	@RequestMapping(value = "/save",method= RequestMethod.POST)
	public ModelAndView empSave(ModelAndView mv, Employee emp) {
		mv.setViewName("redirect:/");
		//List<Employee> list = service.getEmployees();
		
		//mv.addObject("all",list);
		
		service.saveEmp(emp);
		return mv;
	}
	
	
	@RequestMapping(value = "/delete/{id}")
	public ModelAndView deleteEmployees(@PathVariable("id") int id,ModelAndView mv, Employee emp) {
		mv.setViewName("redirect:/");
		//List<Employee> list = service.deleteEmployees();
		
		//mv.addObject("all",list);
//		
		service.deleteEmployees(id);
		return mv;
	}
//	
		
		
		@RequestMapping(value = "/edit")
		public ModelAndView empUpdate(@RequestParam("id") int id,ModelAndView mv, Employee emp) {
			mv=new ModelAndView();
			mv.setViewName("welcome.jsp");
			
			mv.addObject("id",id);
			Employee emp = service.find(id).orElse(new Employee());
			service.saveEmp(emp);
			//List<Employee> list = service.getEmployees();
			
			//mv.addObject("all",list);
			
			//service.saveEmp(emp);
			return mv;
		}
//	@RequestMapping("/sumpage")
//	public String cal()
//	{
//	return "cal.jsp";
//	}
//
//	@RequestMapping("/add")
//	public ModelAndView addition(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelAndView mv)
//	{
//	mv.setViewName("cal.jsp");
//	int sum=num1+num2;
//	mv.addObject("sum",sum);
//	return mv;
//	}
//	
	
	
	
	
//	public String demo(HttpServletRequest req)
//	public String demo(String name, String desig,HttpSession session)
	
//	public String demo(@RequestParam("name") String uname, HttpSession session)
//	{
//		session.setAttribute("username", uname)
//		//HttpSession session = req.getSession();
//		//String name=req.getParameter("name");
//		//String desg=req.getParameter("desg");
////		session.setAttribute("username", name);
////		session.setAttribute("designation", desig);
////		System.out.println(name);
////		return "index.jsp";
//		
//		return "welcome.jsp";
//	}
	
}

