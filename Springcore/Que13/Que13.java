package que13;

public class Que13 {

	String moviename;
	String showtime;
	int priceofticket;
	String business;
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public String getShowtime() {
		return showtime;
	}
	public void setShowtime(String showtime) {
		this.showtime = showtime;
	}
	public int getPriceofticket() {
		return priceofticket;
	}
	public void setPriceofticket(int priceofticket) {
		this.priceofticket = priceofticket;
	}
	public String getBusiness() {
		return business;
	}
	public void setBusiness(String business) {
		this.business = business;
	}
	
	public void show() {
		System.out.println("Movie Name = "+moviename);
		System.out.println("Movie Show Time = "+showtime);
		System.out.println("Price of ticket = "+priceofticket);
		System.out.println("Total Collection = "+business);
		
	} 
}
