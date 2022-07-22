package que11;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Que11Main {

	public static void main(String[] args) {
		
		List<Que11> list=new ArrayList<>();
		
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Que11 student1=(Que11) context.getBean("student1");
	    Que11 student2=(Que11) context.getBean("student2");
		Que11 student3=(Que11) context.getBean("student3");
	
		
		list.add(student1);
	    list.add(student2);
	    list.add(student3);
		
		
		for (Que11 student:list) {
			System.out.println(student.studentname+ ": "+student.obj.totalMarks);
		}
		
		List<Que11> sortlist=list.stream().sorted((s1,s2) ->Float.compare(s1.obj.totalMarks, s2.obj.totalMarks)).collect(Collectors.toList());
		System.out.println("Sorted list of Students as per total Marks");
		
		for(Que11 std:sortlist) {
			System.out.println(std.studentname+ ": "+std.obj.totalMarks);
		}
		
		
	}
	}


