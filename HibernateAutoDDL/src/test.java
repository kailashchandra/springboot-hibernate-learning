import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Course;
import beans.Student;


public class test {

	public static void main(String arg[]){
		Configuration cfg=new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		cfg.buildSessionFactory();
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		
		Student st=new Student();
		st.setId(123);
		st.setName("Yogendra");
		st.setEmail("yogendra92@gmail.com");
		
		Course c=new Course();
		c.setId(111);
		c.setName("Hindi");
		
		s.save(st);//student is persistant.
		s.save(c);
		
		s.beginTransaction().commit();//database state
		
		s.evict(st);//will remove obj so it will be available for gc(detached state.)
		s.evict(c);
		s.close();
		sf.close();
	}
}
