package que15;

public class Customer {

	int id;
	String custname;
	Item item;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public void display() {
		System.out.println("Customer Id : "+id);
		System.out.println("Customer name : "+custname);
		System.out.println("Item id : "+item.id);
		System.out.println("Item name : "+item.iname);
		System.out.println("Item price : "+item.price);
		System.out.println("Category name : "+item.cat.categoryname);
	}
}
