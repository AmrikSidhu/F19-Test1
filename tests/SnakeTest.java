// Amrik Singh Sidhu , SID: C0742318

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SnakeTest {

	Snake snake1;
	Snake snake2;
	
	@Before
	public void setUp() throws Exception {
		
		// snake objects
		snake1 = new Snake("Peter",10,"coffee");
		snake2 = new Snake("Takis",80,"vegetables");
		
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void isHealthyTest() {
		assertTrue(snake1.isHealthy());
		assertTrue(snake2.isHealthy());
		assertFalse(snake1.isHealthy());
		assertFalse(snake2.isHealthy());
	}
	
	@Test
	public void fitsInCageTest() {
		assertTrue(snake1.fitsInCage(9));
		assertTrue(snake1.fitsInCage(10));
		assertTrue(snake1.fitsInCage(11));
	}

	
}