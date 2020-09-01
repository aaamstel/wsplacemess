package com;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

public class UserDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String name;
	String surname;
	@XmlElement(name = "salary", required = true)
	int salary;
	
	int id;
	
	
	public int getID() {
		return id;
	}
	public void setID(int id) {
		this.id = id;
	}
	public String getName()	{
		return name;
}
	public String getSurname()	{
		return surname;
}
	public int getSsalary()	{
		return salary;
}	
	public void setName(String name){
		this.name = name;
}
	public void setSurname(String surname){
		this.surname = surname;
}
	public void setSalary(int salary){
		this.salary = salary;	
}
	
	@Override
	public String toString() {
		
		return name + " " + surname +" " +  id + " " + salary;
		
	}
	
}
