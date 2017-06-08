
import org.hibernate.cfg.*;

import org.hibernate.*;


public class HibernateDemo 
{
	public static void main(String[] args)
	{
		try
		{
			Configuration cfg=new Configuration();
			cfg.configure("hibernate.cfg.xml");
			SessionFactory sessionFactory=cfg.buildSessionFactory();
			
			Emp emp=new Emp();
			emp.setId(4);
			emp.setName("Faris");
			emp.setSalary(59000);
			emp.setAddress("Bangalore");
			
			Session session=sessionFactory.openSession();
			
			
			Transaction tx=session.beginTransaction();
			session.save(emp);
			
			tx.commit();
			
			session.close();
			System.out.println("Objects Saved in database");
			
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised"+e);
		}
		
	}
}
