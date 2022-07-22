package que8;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Que8Main {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Que8 obj=(Que8) context.getBean("bean8");
		obj.display();
		
		System.out.println("Ascending Order");
		obj.ascending();
		
		System.out.println("Descending Order");
		obj.discending();
		
		System.out.println("Remove Duplicate Record");
		obj.removeDuplicate();
	}
	}


