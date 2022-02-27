package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import bean.Student;

public class StudentDao {

	JdbcTemplate Template;

	public void setTemplate(JdbcTemplate template) {
		Template = template;
	}
	
	public int save(Student st){
		String q="insert into student007(sid,sname,semail) values("+st.getSid()+",'"+st.getSname()+"','"+st.getSemail()+"')";
		System.out.println(q);
		return Template.update(q);
	}
	
	public int update(Student st){
		String q="update student007 set sname='"+st.getSname()+"' , semail='"+st.getSemail()+"' where sid="+st.getSid();
		System.out.println(q);
		return Template.update(q);
	}
	
	public int delete(int id){
		String q="delete from student007 where sid="+id;
		System.out.println(q);
		return Template.update(q);
	}
	
	public Student getStudent(int sid){
		return Template.queryForObject("select * from student007 where sid=?", new Object[]{sid}, new BeanPropertyRowMapper<Student>(Student.class));
	}
	
	public List<Student> getStudents(){
		return Template.query("select * from student007 ", new RowMapper<Student>(){

			@Override
			public Student mapRow(ResultSet rs, int row) throws SQLException {
				// TODO Auto-generated method stub
				Student st=new Student();
				st.setSid(rs.getInt(1));
				st.setSname(rs.getString(2));
				st.setSemail(rs.getString(3));
				return st;
			}
		});
	}
}
