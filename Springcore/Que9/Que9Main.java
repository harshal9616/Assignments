package que9;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Que9Main {

	public static void main(String[] args) {
        List<Que9> cityDistList = new ArrayList<Que9>();
        Scanner sc = new Scanner(System.in);

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        Que9 ob1 = (Que9) context.getBean("d1");
        Que9 ob2 = (Que9) context.getBean("d2");
        Que9 ob3 = (Que9) context.getBean("d3");
        Que9 ob4 = (Que9) context.getBean("d4");

        cityDistList.add(ob1);
        cityDistList.add(ob2);
        cityDistList.add(ob3);
        cityDistList.add(ob4);

        System.out.println("Enter boarding point");
        String fromCity = sc.next();

        System.out.println("Enter destination");
        String toCity = sc.next();

        List<Que9> matchedList = cityDistList.stream().filter(c -> c.getFromcity().equalsIgnoreCase(fromCity))
                .filter(c -> c.getTocity().equalsIgnoreCase(toCity)).collect(Collectors.toList());

        if (!matchedList.isEmpty()) {
            for (Que9 cities : matchedList) {
                System.out.print("Distance between "+cities.getFromcity() +" and "+cities.getTocity()+" is "+cities.getDistance() + " Km");

            }
        } else
            System.out.println("Data not available");
    }
}
