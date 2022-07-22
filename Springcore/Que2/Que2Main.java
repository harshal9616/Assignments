package que2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Que2Main {

	public static void main(String args[]) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Que2 ob=(Que2) context.getBean("bean2");
				ob.average();
	}
	
}
