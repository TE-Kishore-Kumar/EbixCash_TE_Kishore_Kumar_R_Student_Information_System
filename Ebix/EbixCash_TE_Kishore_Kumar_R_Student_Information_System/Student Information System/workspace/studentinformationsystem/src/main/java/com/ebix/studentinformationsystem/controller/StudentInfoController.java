package com.ebix.studentinformationsystem.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ebix.studentinformationsystem.beans.StudentInfo;
import com.ebix.studentinformationsystem.service.StudentService;

@Controller
public class StudentInfoController {

	@Autowired(required = false)
	private StudentService service;
	
	@GetMapping("/signup")
	public String getRegisterPage() {
		return "Register";
	}
	
	@PostMapping("/register")
	public String registerUser(StudentInfo info, ModelMap map) {
		if (service.register(info)) {
			map.addAttribute("err", "Registered Successfully");
			return "Login";
		} else {
			map.addAttribute("err", "Date Already Exist");
			return "Register";
		}
	}
	
	@GetMapping("/login")
	public String getLoginPage() {
		return "Login";
	}
	
	@PostMapping("/login")
	public String authenticate(Integer rollNumber, String password, ModelMap map, HttpServletRequest request) {
		StudentInfo info = service.authenticate(rollNumber, password);

		HttpSession session = request.getSession(true);
		session.setAttribute("isLoggedIn", info);
		map.addAttribute("user", info);
		return "Welcome";

	}
	
	
	@GetMapping("/showdata")
	public String getData(HttpServletRequest req, ModelMap map) {
		StudentInfo info=(StudentInfo) req.getSession().getAttribute("isLoggedIn");
		if(info.getRollNumber() != null) {
			List<StudentInfo> info1 = service.getAll(info.getRollNumber());
			System.out.println(info);
			if(info1 != null) {
				map.addAttribute("allData", info1);
				return "GetData";
			} else {
				map.addAttribute("error", "Data Not Found");
				return "Login";
			}
		} else {
			map.addAttribute("error", "Please Login First");
			return "Login";
		}
	}
	
	@GetMapping("/subjects")
	public String getSubjects() {
		return "Subjects";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session, ModelMap map) {
		session.invalidate();
		map.addAttribute("err", "Logged out Successfully");
		return "Login";
	}
	
	
}
