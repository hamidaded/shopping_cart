import java.util.ArrayList;
//import softwareHW.Book;

public class ShippingCart {

	
public ArrayList<Book> cart = new ArrayList<Book>();
	
	public int getCount() {
		return cart.size();
	}
	
	public void addBook(Book book) {
		this.cart.add(book);
	}
	
	public double getPrice() {
		double cost = 0;
		for(int i = 0; i < cart.size(); i++) {
			cost += cart.get(i).getPrice();
		}
		return cost;
	}
}
