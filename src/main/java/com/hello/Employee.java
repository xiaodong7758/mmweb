/**  
 * Project Name:hello  
 * File Name:Employee.java  
 * Package Name:com.hello  
 * Date:2017年8月21日上午9:05:48  
 * Copyright (c) 2017, chenzhou1025@126.com All Rights Reserved.  
 *  
*/  
  
package com.hello;  
/**  
 * ClassName:Employee <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2017年8月21日 上午9:05:48 <br/>  
 * @author   DLF  
 * @version    
 * @see        
 */
public class Employee {

	private int id ;
	private String name;
	private int age;
	private int salary;
	
	public Employee() {
		super();
	}
	public Employee(int id, String name, int age, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public Employee(String name) {
		super();
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		System.out.println("===========");
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
  
