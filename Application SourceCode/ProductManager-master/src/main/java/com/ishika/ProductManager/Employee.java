package com.ishika.ProductManager;

import java.util.*;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.*;

@Entity
@Table(name="Employee")
public class Employee {
	
	

	@Id @GeneratedValue(strategy= GenerationType.IDENTITY)
	private long empid;
	
	private String username;
	
	private String password;
	
	private String roles;

 

	public Employee()
	{
		
	}
	
	public Employee(long empid, String empname, String empwd, String roles) {
		this.empid = empid;
		this.username = empname;
		this.password = empwd;
		this.roles = roles;
       
	}

	public long getEmpid() {
		return empid;
	}

	public void setEmpid(long empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return username;
	}

	public void setEmpname(String empname) {
		this.username = empname;
	}

	public String getEmpwd() {
		return password;
	}

	public void setEmpwd(String empwd) {
		this.password = empwd;
	}
	
	public String getRoles() {
        return roles;
    }

   

    public List<String> getRoleList(){
        if(this.roles.length() > 0){
            return Arrays.asList(this.roles.split(","));
        }
        return new ArrayList<>();
    }


}
