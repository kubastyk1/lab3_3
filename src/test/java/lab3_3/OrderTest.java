package lab3_3;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.iis.mto.time.AdvancedTimeSrc;
import edu.iis.mto.time.Order;
import edu.iis.mto.time.OrderExpiredException;

public class OrderTest {

	@Test(expected = OrderExpiredException.class)
	public void testAdvancedTimeSrc() {
		Order order = new Order(new AdvancedTimeSrc());
		order.submit();
		order.confirm();
	}

}
