package que3;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Que3Main {

	public static void main(String[] args) {
		
	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
      Que3 obj=(Que3) context.getBean("bean3");
      
      System.out.println("Interest Rate "+obj.rate+"%");
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Amount");
		float amount=sc.nextFloat();
		
		System.out.println("Enter Validity in Years:");
		int validity=sc.nextInt();
		int vim=validity*12;  //validity in month//
		
		double TPA=amount +((amount*obj.rate)/100)*validity;//Total Payable Amount//
		System.out.println("Total Payable Amount:"+TPA);
		
		double emi=TPA/vim;
		System.out.println("EMI:"+emi);
	}
	}


