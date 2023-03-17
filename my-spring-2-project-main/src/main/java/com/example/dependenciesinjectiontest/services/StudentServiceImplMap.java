package com.example.dependenciesinjectiontest.services;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.Map;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.dependenciesinjectiontest.model.Student;

@Service
@Primary
public class StudentServiceImplMap implements StudentService {

	private Map<String, Student>studentList;

	public StudentServiceImplMap() {
		studentList = new HashMap<>();
	 

	}

	@Override
	public void add(Student student) {
		studentList.put(student.getIdStudent(), student);
	}

	@Override
	public void delete(Student student) {
		studentList.remove(student.getIdStudent());
	}

	@Override
	public List<Student> all() {
		return new ArrayList<>(studentList.values());
	}

	@Override
	public Student findById(String id) {
		return studentList.get(id);
	}

	 

}
