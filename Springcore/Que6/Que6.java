package que6;

public class Que6 {

	
	String str[];

	public String[] getStr() {
		return str;
	}

	public void setStr(String[] str) {
		this.str = str;
	}
	public void show() {
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
	}
		public void result() {
			
		for(String a:str) {
			String s1=a.replaceAll("[aeiouAEIOU]", "");
			if(a.equals(s1)) 
				System.out.println(a);
		
		}
		
	}
}
