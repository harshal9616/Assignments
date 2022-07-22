package que1;

public class Que1 {

	
	private Que1() {
		
	}
	
	public static Que1 getobj() {
		return new Que1();
	}
	
	public void show() {
    	System.out.println("Role based object is created");
    }
}
