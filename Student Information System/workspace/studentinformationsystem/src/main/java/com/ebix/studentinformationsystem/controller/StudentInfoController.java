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
import com.ebix.studentinformationsystem.beans.StudentInfo2;
import com.ebix.studentinformationsystem.beans.StudentInfo3;
import com.ebix.studentinformationsystem.service.StudentService;

@Controller
public class StudentInfoController {

	@Autowired(required = false)
	private StudentService service;

	@GetMapping("/signup")
	public String getRegisterPage() {
		return "Register";
	}

	@GetMapping("/signup2")
	public String getRegisterPage2() {
		return "Register2";
	}

	@GetMapping("/signup3")
	public String getRegisterPage3() {
		return "Register3";
	}

	@PostMapping("/register")
	public String registerYear1(StudentInfo info, ModelMap map) {


		if (service.registerYear1(info)) {
			map.addAttribute("err", "Registered Successfully");
			return "Register2";
		} else {
			map.addAttribute("err", "Data Already Exist");
			return "Register";
		}
	}

	@PostMapping("/register2")
	public String registerYear2(StudentInfo2 info2, ModelMap map) {
		if (service.registerYear2(info2)) {
			map.addAttribute("err", "Registered Successfully");
			return "Register3";
		} else {
			map.addAttribute("err", "Data Already Exist");
			return "Register";
		}
	}

	@PostMapping("/register3")
	public String registerYear3(StudentInfo3 info3, ModelMap map) {
		if (service.registerYear3(info3)) {
			map.addAttribute("err", "Registered Successfully");
			return "Login";
		} else {
			map.addAttribute("err", "Data Already Exist");
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
		if(info != null) {
		HttpSession session = request.getSession(true);
		session.setAttribute("isLoggedIn", info);
		map.addAttribute("user", info);
		return "Welcome";
		}else {
			map.addAttribute("err", "Invalid Credentials");
			return "Login";
		}

	}

	@GetMapping("/showdata")
	public String getData(HttpServletRequest req, ModelMap map, String details) {
//		StudentInfo info=(StudentInfo) req.getSession().getAttribute("isLoggedIn");
//		if(info.getRollNumber() != null) {
//			List<StudentInfo> info1 = service.getAll(info.getRollNumber());
//			System.out.println(info);
//			if(info1 != null) {
//				map.addAttribute("allData", info1);
//				return "GetData";
//			} else {
//				map.addAttribute("error", "Data Not Found");
//				return "Login";
//			}
//		} else {
//			map.addAttribute("error", "Please Login First");
//			return "Login";
//		}
		System.out.println(details);
		if(details.equals("year1")) {
			List<StudentInfo> info = service.getFirst();
			System.out.println(info);
			if(info!= null) {
			map.addAttribute("data", info);
			return "GetData";
			}
		}else if(details.equals("year2")) {
			List<StudentInfo2> info2 = service.getSecond();
			if(info2 != null) {
			map.addAttribute("data", info2);
			return "GetData2";
			}
		} else if(details.equals("year3")) {
			List<StudentInfo3> info3 = service.getThird();
			if(info3 != null) {
				map.addAttribute("data", info3);
				return "GetData3";
			}
		}
		map.addAttribute("err", "Something Went Wrong");
		return "Welcome";
	}

//	@GetMapping("/showdata")
//	public String getYear(String year, ModelMap map) {
//		if(year.equals("year1")) {
//			List<StudentInfo> data1 = service.getFirstYear();
//			if(data1 != null) {
//				return "GetData";
//			}
//		} else if(year.equals("year2")) {
//			List<StudentInfo2> data2 = service.getSecondYear();
//			if(data2 != null) {
//				return "GetData";
//			}
//		} else if(year.equals("year3")) {
//			List<StudentInfo3> data3 = service.getThirdYear();
//			if(data3 != null) {
//				return "GetData";
//			}
//		}
//		return "Welcome";
//	}

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

	@GetMapping("/welcome")
	public String welcomePage() {
		return "Welcome";
	}
}
