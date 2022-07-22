package que1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Que1Main {

	public static void main(String args[]) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		
		Que1 ob=(Que1) context.getBean("bean1");
		ob.show();
	}
	
	
}
