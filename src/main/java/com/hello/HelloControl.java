/**  
 * Project Name:hello  
 * File Name:HelloControl.java  
 * Package Name:com.hello  
 * Date:2017��6��27������4:33:50  
 * Copyright (c) 2017, chenzhou1025@126.com All Rights Reserved.  
 *  
*/  
  
package com.hello;

import static org.hamcrest.CoreMatchers.either;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloControl {

	@RequestMapping("/hello")
	public String index(){
		return "say hello";
	}
	public static void main(String[] args) {
//		List<Employee> list = Arrays.asList(new Employee(1, "qw", 12, 34),
//										    new Employee(4, "张三", 12, 2355),
//										    new Employee(5, "张四", 45, 265),
//										    new Employee(3, "张5", 65, 2265));
//		
//		Stream<Employee> stream = list.stream().filter((e)->{
//			System.out.println("=====");
//			return e.getAge()>30;
//		});
//		
//		
//		
//		stream.forEach(System.out::println);
//		List<Employee> list = Arrays.asList(new Employee(1, "qw", 12, 34),
//					    new Employee(4, "张三", 12, 2355),
//					    new Employee(5, "张四", 45, 265),
//					    new Employee(3, "张5", 65, 2265));
//		
//		Stream<Employee> stream = list.stream().filter(e -> e.getAge()<30).limit(1);
//		
//		
//		
//		stream.forEach(System.out::println);
//		List<Employee> list = Arrays.asList(new Employee(1, "qw", 12, 34),
//			    new Employee(4, "张三", 12, 2355),
//			    new Employee(5, "张四", 45, 265),
//			    new Employee(3, "张5", 65, 2265));
//
//		Stream<Integer> sorted = list.stream().map(Employee::getSalary).sorted();
		Function<Integer, String[]> function = String[]::new;
		String[] apply = function.apply(90);
		System.out.println(apply.length);
		Consumer<Employee> consumer = (e) -> e.setAge(0);
		consumer.accept(new Employee());
		Function<String, Employee> function2 = Employee::new;
		Employee apply2 = function2.apply("sdfs");
		System.out.println(apply2.getName());
		}
	
	
}
  
