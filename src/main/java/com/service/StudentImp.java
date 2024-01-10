package com.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.bean.Student;
import com.repository.StudentRepository;



public class StudentImp implements StudentService{
	
	private static  Logger log=LoggerFactory.getLogger(StudentImp.class);
	
@Autowired
StudentRepository studentRepository;

	@Override
	public void save(StudentService studentService) {
		Student student=new Student();
		student.getId();
		student.getName();
		student.getSubject();
		student.getFaculty();
		studentRepository.save(student);
		log.info("StudentService saved-",studentService );
	}

}
