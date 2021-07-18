package com.company;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
//	    new Thread(()-> {
//	    	System.out.println("Print from the Runnable");
//			System.out.println("Line 2");
//			System.out.format("This is line %d\n", 3);
//		}).start();

		//adding employees to the Employee list
	    Employee john = new Employee("John Doe", 30);
	    Employee fred = new Employee("Fred Dao", 24);
	    Employee jack = new Employee("Jack Hill", 40);
	    Employee snow = new Employee("Snow White", 22);

	    //list of Employees
	    List<Employee> employees = new ArrayList<>();
	    employees.add(john);
	    employees.add(fred);
	    employees.add(jack);
	    employees.add(snow);

//	    Collections.sort(employees, new Comparator<Employee>(){
//	    	@Override
//			public int compare(Employee employee1, Employee employee2){
//	    		return employee1.getName().compareTo(employee2.getName());
//			}
//		});

		//Lambda Expression Example
		//Lambda is being passed as the second parameter below

		//First part of the lambda is (Employee employee1, Employee employee2)
		//Second part is the arrow function
		//Third part is the body IE employee1.getName().compareTo(employee2.getName()

		//Sorts employees in alphabetical order using the .sort() method

		Collections.sort(employees, (employee1, employee2) ->
				employee1.getName().compareTo(employee2.getName()));

		//iterates through employees list returning a list to the console
		for(Employee employee : employees)
			System.out.println(employee.getName());
    }
}

	public final static String doStringStuff(UpperConcat uc, String s1, String s2) {
		return uc.upperAndConcat(s1, s2);
}
}
//Employee class
class Employee {
	//private variables
	private String name;
	private int age;

	//constructor method
	public Employee(String name, int age){
		this.name = name;
		this.age = age;
	}

	//getter for name
	public String getName() {
		return name;
	}

	//setter for name
	public void setName(String name) {
		this.name = name;
	}

	//getter for age
	public int getAge() {
		return age;
	}

	//setter for age
	public void setAge(int age) {
		this.age = age;
	}
}


interface UpperConcat {
	public String upperAndConcat(String s1, String s2);
}

//class CodeToRun implements Runnable {
//	@Override
//	public void run(){
//		System.out.println("Printing from the Runnable");
//	}
//
//}