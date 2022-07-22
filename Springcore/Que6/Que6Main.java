package que6;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Que6Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		 Que6 obj = (Que6) context.getBean("bean6");
		 obj.result();
	}
	
}
