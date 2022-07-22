package que10;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Que10 {

	 private HashMap<String, Integer> std;

	    public Que10() {
	        super();
	    }

	    public Map<String, Integer> getStd() {

	        System.out.println(std);
	        System.out.println("Sort all Data by Value");
	        Map<String, Integer> tempMap = std.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry :: getKey, Map.Entry :: getValue , (e1, e2) -> e1, LinkedHashMap :: new));
	        System.out.println(tempMap);
	        return std;    

	    }
	    public void setStd(HashMap<String, Integer> std) {
	        this.std = std;
	       
	    }
	    
	    @Override
	    public String toString() {
	        return "Student [std=" + std + "]";
	    }
	
	
}
