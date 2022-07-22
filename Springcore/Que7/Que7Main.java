package que7;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Que7Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Que7_Array1 obj=(Que7_Array1) context.getBean("bean7");
        obj.merge();
	}
}
