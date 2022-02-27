package dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import beans.Student;

public class StudentDao {

	HibernateTemplate hibernatetemplate;

	public void setHibernatetemplate(HibernateTemplate hibernatetemplate) {
		this.hibernatetemplate = hibernatetemplate;
	}
	
	public void saveStudent(Student st){
		hibernatetemplate.save(st);
	}
	
	public void updateStudent(Student st){
		hibernatetemplate.update(st);
	}
	
	public void deleteStudent(Student st){
		hibernatetemplate.delete(st);
	}
	
	public Student getStudent(Serializable id){
		Student st=(Student)hibernatetemplate.get(Student.class, id);
		return st;
	}
	
	public List<Student> getStudents(){
		ArrayList<Student> arr=(ArrayList<Student>)hibernatetemplate.loadAll(Student.class);
		return arr;
	}
}
