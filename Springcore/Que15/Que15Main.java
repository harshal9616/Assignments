package que15;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class Que15Main {
		public static void main(String[] args) {
			List<Customer>slist =new ArrayList<Customer>();
			ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
			Customer c=(Customer) context.getBean("bean15");
			c.display();


		}
}
