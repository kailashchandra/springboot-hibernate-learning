package Driver;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Student;
import dao.StudentDao;

public class TestDriver {

	public static void main(String arg[]){
		ApplicationContext ct=new ClassPathXmlApplicationContext("Resources/SpringTest.xml");
		
		StudentDao stdao=(StudentDao)ct.getBean("sdao");
		
		Student st=new Student();
		st.setSid(109);
		st.setSname("Tannu");
		st.setSemail("Tannu@parmar.com");
		
		
		stdao.saveStudent(st);
		
		System.out.println(stdao.getStudent(st.getSid()));
		
		ArrayList<Student> ar=(ArrayList<Student>)stdao.getStudents();
		System.out.println("before delete");
		for(Student s: ar){
			System.out.println(s.getSid()+" "+s.getSname()+" "+s.getSemail());
		}
		stdao.deleteStudent(st);
		System.out.println("after delete");
		ArrayList<Student> ar2=(ArrayList<Student>)stdao.getStudents();
		
		for(Student s: ar2){
			System.out.println(s.getSid()+" "+s.getSname()+" "+s.getSemail());
		}
	}
}
