import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class shippingCartTest {

	@Test
	public void EmptyShippingCartTest() {
		ShippingCart cart = new ShippingCart();
		Assert.assertEquals(0, cart.getCount());
	}
	
	@Test
	public void OneShippingCartTest() {
		ShippingCart cart = new ShippingCart();
		Book book = new Book("Java Book", 127.0);
		cart.addBook(book);
		Assert.assertEquals(1, cart.getCount());
		Assert.assertEquals(127.0, cart.getPrice(), 127.0);
	}
	
	@Test
	public void ManyShippingCartTest() {
		ShippingCart cart = new ShippingCart();
		Book book = new Book("Java Book", 127.0);
		Book book1 = new Book("Web design Book", 100);
		cart.addBook(book);
		cart.addBook(book1);
		Assert.assertEquals(2, cart.getCount());
		Assert.assertEquals(227, cart.getPrice(),227);
	}
	
	
}
