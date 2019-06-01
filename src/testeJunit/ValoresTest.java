package testeJunit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ValoresTest {
Valores val = new Valores();
	
	@Before
	public void setUp() throws Exception {
		
		val = new Valores();
		
		val.ins(5);
		val.ins(7);
		val.ins(5);
		
	}

	
	@Test
	public void testMean() {
		
		
		assertEquals(5, val.mean());
	
		
	}
	
	@Test
	public void testIns() {
		
	
		assertEquals(3, val.size());
	
	}
	
	@Test
	public void testDel() {
		
	
		assertEquals(0, val.del(7));
		
		
	}

	@Test
	public void testGreater() {
		
	
		assertEquals(7, val.greater());
		
		
	}

	@Test
	public void testLower() {
		
		
		assertEquals(0, val.lower());
		
		
	}
	
}
