package com.example.dependenciesinjectiontest.model;
import java.util.Date;
public class Student {
	 private final String idStudent;

	    private final int idType;

	    private final String name;

	    private final String lastName;

	    private final int nationality;

	    private String address;

	    private Date birthDate;
	    

	    public Student( String idStudent, int idType, String name, String lastName, int nationality, String address,Date birthDate )
	    {
	        this.idStudent = idStudent;
	        this.idType = idType;
	        this.name =  name;
	        this.lastName = lastName;
	        this.nationality =  nationality;
	        this.address = address;
	        this.birthDate =birthDate;
	    }

	    public void setAddress( String address )
	    {
	        this.address = address;
	    }

	    public void setBirthDate( Date birthDate )
	    {
	        this.birthDate = birthDate;
	    }

	    public String getIdStudent()
	    {
	        return idStudent;
	    }

	    public int getIdType()
	    {
	        return idType;
	    }

	    public String getName()
	    {
	        return name;
	    }

	    public String getLastName()
	    {
	        return lastName;
	    }

	    public int getNationality()
	    {
	        return nationality;
	    }

	    public String getAddress()
	    {
	        return address;
	    }

	    public Date getBirthDate()
	    {
	        return birthDate;
	    }

		 

		public void put(String idStudent2, Student student) {
			// TODO Auto-generated method stub
		 
		}

		public void remove(String idStudent2) {
			// TODO Auto-generated method stub
			
		}

		 
		 
 
}
