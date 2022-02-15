package com.ebix.studentinformationsystem.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import com.ebix.studentinformationsystem.exception.StudentException;

@ControllerAdvice
public class StudentControllerAdvice {

	@ExceptionHandler(StudentException.class)
	public String handleEE(StudentException exp, HttpServletRequest req) {
		req.setAttribute("err", exp.getMessage());
		return "Login";
	}
	
	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
	public String handleEE(MethodArgumentTypeMismatchException exp, HttpServletRequest req) {
		req.setAttribute("err", exp.getMessage());
		return "GetData";
	}
	
	
}
