import static org.junit.Assert.*;

import org.junit.Test;

public class CritterUnitTest {
	@Test
	public void testPoodle(){
		Critter c = new Poodle();
		assertTrue(c instanceof Trainable);
		assertTrue(c instanceof Sellable);
		assertFalse(c.getClass() == Bovine.class);
		//System.out.println(c instanceof Trainable); // must print true
	}
}
