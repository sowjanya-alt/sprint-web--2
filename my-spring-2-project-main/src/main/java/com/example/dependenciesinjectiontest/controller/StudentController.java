package com.example.dependenciesinjectiontest.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.dependenciesinjectiontest.model.Student;
import com.example.dependenciesinjectiontest.services.StudentService;

@RestController
public class StudentController {
	@Autowired
	//@Qualifier("studentServiceImplMap")
	private final StudentService studentService;

	public StudentController(@Qualifier("studentServiceImplMap") StudentService studentService) {
		super();
		this.studentService = studentService;
		studentService.add(new Student("emp101",101, "Sowjanya", "Mekala", 507165, "Khammam", new Date()));
	}

	@GetMapping("/student/{id}")
	Student findById(@PathVariable("id") String id) {
		return studentService.findById(id);
	}
}
