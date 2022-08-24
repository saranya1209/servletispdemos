import org.hibernate.Session;

import com.sample.domain.Message;
import com.sample.util.HibernateUtil;

public class HibernateTest {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Message message = new Message("Hello world with Hibernate"); 
		
		session.save(message);
		
		session.getTransaction().commit();
		
		session.close();
		
	}
}