package beans;

public class Student {

	private int sid;
	private String sname,semail;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
	}
	public Student(int sid, String sname, String semail) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.semail = semail;
	}
	public Student(){
		
	}
}
