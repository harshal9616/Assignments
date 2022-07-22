package que14;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.*;
public class Que14Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		
		System.out.println("Enter your choice"+"\n"+"1.Circle" +"\n" +"2.Rectangle" +"\n" +"3.Square");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		switch(ch) {
		
		case 1:
			Circle obj2=(Circle) context.getBean("cir");
			System.out.println("Area Of Circle :"+obj2.area());
			System.out.println("Circumference Of Circle :"+obj2.side());
			break;
			
		case 2:
			Rectangle obj=(Rectangle) context.getBean("rect");
			System.out.println("Area of Rectangle :"+obj.area());
			System.out.println("Perimeter of Rectangle :"+obj.side());
			break;
			
		case 3:
			Square obj1=(Square) context.getBean("square");
			System.out.println("Area Of  Square :"+obj1.area());
			System.out.println("Perimeter Of  Square:"+obj1.side());
			break;
			
		}
		
	
}
}
