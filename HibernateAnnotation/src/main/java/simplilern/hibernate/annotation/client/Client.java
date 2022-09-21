package simplilern.hibernate.annotation.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import simplilern.hibernate.annotation.beans.Student;

public class Client {
	public static void main(String args[])
	{
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory=meta.getSessionFactoryBuilder().build();
		
		Student student1 =new Student("Ansul","Rathi","A++");
		Student student2 =new Student("Ayush","Rathi","A+");
		
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		int rollNo1=(int)session.save(student1);
		int rollNo2=(int)session.save(student2);
		transaction.commit();
		System.out.println("roll no : "+rollNo1);
		System.out.println("roll no : "+rollNo2);
		factory.close();
	}
}
