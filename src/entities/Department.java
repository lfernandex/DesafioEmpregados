package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {
	
	private String name;
	private Integer payDay;
	private Address address;
	
	List<Employee> emp = new ArrayList<>();

	public Department() {
	}
	 
	public Department(String name, Integer payDay, Address address) {
		this.name = name;
		this.payDay = payDay;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPayDay() {
		return payDay;
	}

	public void setPayDay(Integer payDay) {
		this.payDay = payDay;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	 
	public void addEmployee(Employee employee) {
		  emp.add(employee);
	}
	
	public void removeEmployee(Employee employee) {
		emp.remove(employee);
	}
	
	public double payroll() {
		double num = 0;
		for (Employee c : emp) {
			num += c.getSalary();
		}
		return num;
		
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Employee c : emp ) {
			sb.append(c + "\n");
		}
		return sb.toString();
	}
	
}
