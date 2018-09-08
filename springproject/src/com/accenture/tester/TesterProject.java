package com.accenture.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.accenture.entity.Employee;

public class TesterProject {

	public static void main(String[] args) {

    ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
    Employee employee=(Employee) context.getBean("employee");
    System.out.println("Employee id "+employee.getId());
    System.out.println("Employee name "+employee.getName());
    System.out.println("Employee email "+employee.getEmail());

    System.out.println("Hello");

    System.out.println("Hello World");
    

    System.out.println("Nice Man");

    System.out.println("Nice");

	}

}
