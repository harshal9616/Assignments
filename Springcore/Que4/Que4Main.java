package que4;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Que4Main {
	public static void main(String[] args) {
		
		List<Que4> list=new ArrayList<Que4>();
		 ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		
		 Que4 obj=(Que4) context.getBean("emp1");
		 Que4 obj1=(Que4) context.getBean("emp2"); 
		 
		list.add(obj);
		list.add(obj1);
	
		List<Que4> sorted=list.stream().sorted((e1,e2) ->Double.compare(e1.salary,e2.salary)).collect(Collectors.toList());
		
		for (Que4 emp:sorted) {
			emp.employeeDetails();
		 
		 System.out.println(obj);
		}
	}
}	
	

