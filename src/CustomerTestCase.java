import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;
import org.junit.Test;


public class CustomerTestCase {
	Customer customer = new Customer("Jane Doe", 55, 123321233, "123 john way", "fairfax", 22903);
	
	@Test
	public void test() {
		assertEquals(customer.getName(), "Jane Doe");
		assertEquals(customer.getAge(), 55);
		assertEquals(customer.getSsn(), 123321233);
		assertEquals(customer.getAddress(),"123 john way");
		assertEquals(customer.getCity(), "fairfax");
		assertEquals(customer.getZipcode(), 22903);		
	}

}
