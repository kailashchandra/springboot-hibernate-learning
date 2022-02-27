package test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import bean.*;

public class Client {

	public static void main(String arg[]){
		Student st=new Student();
		st.setSid(111);
		st.setSname("Kailash");
		st.setSemail("Kailash.daata@gmail.com");
		//student is transiant(simple) object
		
		Configuration cfg=new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		
		s.save(st);//student is persistant.
		
		s.beginTransaction().commit();//database state
		
		s.evict(st);//will remove obj so it will be available for gc(detached state.)
		
		s.close();
		sf.close();
	
	}
}
