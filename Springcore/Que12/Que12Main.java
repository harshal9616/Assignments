package que12;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Que12Main {

	public static void main(String[] args) {
		List<Que12> list=new ArrayList<>();
        
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");

		Que12 obj1=(Que12) context.getBean("bean12emp1");
		Que12 obj2=(Que12) context.getBean("bean12emp2");
		Que12 obj3=(Que12) context.getBean("bean12emp3");
		Que12 obj4=(Que12) context.getBean("bean12emp4");
		Que12 obj5=(Que12) context.getBean("bean12emp5");
		
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		list.add(obj4);
		list.add(obj5);

		Que12 max=list.stream().max((s1 ,s2) ->s1.salary >s2.salary ? 1:-1).get();
		System.out.println("Maximum Salary in Department :"+max);
		System.out.println("Name of Employee having Highest Salary :"+max.empname);

		Double average=list.stream().collect(Collectors.averagingDouble(e ->e.salary));
		List <Que12> minavg=list.stream().filter(m ->m.salary<average).collect(Collectors.toList());

		System.out.println("\nEmployee Having Salary Less Than or Equal to Average Salary");
		for(Que12 e:minavg) {
			System.out.println(e.empname+ " "+e.salary);	
		}
		List<String> department1=list.stream().map(r ->r.getDepartment()).distinct().collect(Collectors.toList());
	
		for (String dept:department1) {

			Double avg=list.stream().filter(a ->a.department.equals(dept)).collect(Collectors.averagingDouble(e-> e.salary));
			System.out.println("Average Salary in Each Department : \n Average Salary:"+avg+ "Department:"+dept);
		}	
	}  
		
}


