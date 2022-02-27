package DriverTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.EmployeeDao;
import bean.Student;
public class DriverTest {
	
	public static void main(String arg[]){
		ApplicationContext ct=new ClassPathXmlApplicationContext("Resources/SpringTest.xml");
		
		Student st=(Student)ct.getBean("student");
		
		EmployeeDao d=(EmployeeDao)ct.getBean("sdao");
		
		System.out.println((d.saveStudent(st)));
		
		System.out.println(d.updateStudent(new Student(121,"Tannu","tanu@gmail.com")));
		
		System.out.println(d.deleteStudent(new Student(111,"Kailash","Kailash.daata@gmail.com")));
	}

}
