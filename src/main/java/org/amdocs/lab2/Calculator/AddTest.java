import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AddTest {
	@Test
	public void testSimpleAdddition(){
		Addition addition = new Addition();
		int result = addition.evaluate(10,20); 
		assertEquals(30,result,0.0001);
		 result = addition.evaluate(40,40); 
		assertEquals(80,result,0.0001);
	}
	

}
