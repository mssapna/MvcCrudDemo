package com.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Studentlogin;

@Controller
public class StudentController2 {
	private static Logger log = LoggerFactory.getLogger(StudentController2.class.getSimpleName());

	@RequestMapping(path = "/student2", method = RequestMethod.GET)
	public ModelAndView student() {
		return new ModelAndView("student2","stud",new Studentlogin());

	}
	@RequestMapping(path = "/student2", method = RequestMethod.POST)
	public ModelAndView createStandard(@ModelAttribute Studentlogin student) {
		return new ModelAndView("demo","stud",student);
		
	}

}
