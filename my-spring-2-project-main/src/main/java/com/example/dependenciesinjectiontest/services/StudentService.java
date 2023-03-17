package com.example.dependenciesinjectiontest.services;

import java.util.List;

import com.example.dependenciesinjectiontest.model.Student;

public interface StudentService {

	  void add( Student student );

	    void delete( Student student );

	    List<Student> all();

	    Student findById( String id );

	 

}
