package que13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Que13Main {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
	Que13 obj1=(Que13) context.getBean("movie1");
	Que13 obj2=(Que13) context.getBean("movie2");

	obj1.show();
	obj2.show();
	
}
}