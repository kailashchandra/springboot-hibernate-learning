package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

import bean.Student;

public class EmployeeDao {
	private JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	/*for for simple query
	public int saveStudent(Student s){
		
		 String q="insert into student007 values("+s.getSid()+",'"+s.getSname()+"','"+s.getSemail()+"')";
		 
		System.out.println(q);
		return jt.update(q);
		
		
		
	}*/
	public Integer saveStudent(final Student s){
	//for parameterized query
			String q="insert into student007 values(?,?,?)";
			return (Integer) jt.execute(q, new PreparedStatementCallback<Integer>(){
				public Integer doInPreparedStatement(PreparedStatement ps)
						throws SQLException, DataAccessException {
					ps.setInt(1, s.getSid());
					ps.setString(2, s.getSname());
					ps.setString(3, s.getSemail());
					
					// TODO Auto-generated method stub
					return ps.executeUpdate();
				}
			});
	}
	
	public int updateStudent(Student s){
		String q="update student007 set sname='"+s.getSname()+"',semail='"+s.getSemail()+"'where sid="+s.getSid();
		System.out.println(q);
		return jt.update(q);
	}
	
	public int deleteStudent(Student s){
		String q="delete from student007 where sid="+s.getSid();
		System.out.println(q);
		return jt.update(q);
	}
}