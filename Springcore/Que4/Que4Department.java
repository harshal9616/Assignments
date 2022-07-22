package que4;

public class Que4Department {

	
	int did;
	String dname;
	
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	
	@Override
	public String toString() {
		return "Department Id=" + did + ", Department Name=" + dname;
	}
}
