package practice_program;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.fail;

import org.testng.Assert.*;
import org.testng.annotations.Test;

public class assertation {

	@Test
	public void create() {
		System.out.println("-----line1----");
		System.out.println("-----line2----");
		System.out.println("-----line3----");
		System.out.println("-----line4----");
		assertEquals("A", "A", "Invlaid data");
		System.out.println("-----line5----");
		System.out.println("-----line6----");

	}

	@Test
	public void update() {
		System.out.println("-----line7----");
		System.out.println("-----line8----");
		assertNotEquals("A", "B");
	}

}
