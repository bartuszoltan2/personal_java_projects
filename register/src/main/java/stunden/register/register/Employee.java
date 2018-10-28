package stunden.register.register;

import java.time.LocalDateTime;

public class Employee {
	private String name;
	private String email;
	private LocalDateTime dateOfBirth;
	private double salary;
	private LocalDateTime timeOfLeaving;

	public Employee(String name, String email, LocalDateTime dateOfBirth, LocalDateTime timeOfLeaving) {
		super();
		this.name = name;
		this.email = email;
		this.setTimeOfLeaving(timeOfLeaving);
		this.setDateOfBirth(dateOfBirth);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDateTime getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDateTime dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public LocalDateTime getTimeOfLeaving() {
		return timeOfLeaving;
	}
	public void setTimeOfLeaving(LocalDateTime timeOfLeaving) {
		this.timeOfLeaving = timeOfLeaving;
	}
	
}
