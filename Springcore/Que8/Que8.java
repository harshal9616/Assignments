package que8;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Que8 {

	List<Integer> item;

	public List<Integer> getItem() {
		return item;
	}

	public void setItem(List<Integer> item) {
		this.item = item;
	}
  public void display() {
	  System.out.println(this.item);
  }
   public void ascending () {
	   item.stream().sorted().forEach(System.out::println);;
   }
   public void discending() {
	   item.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
   }
   public void removeDuplicate() {
	   Set remove=(Set) item.stream().collect(Collectors.toSet());
	   System.out.println(remove);
   }
	
}
