package practice_program;

import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNotSame;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertSame;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertTest {
	@Test
	public void create()
	{
		String a="virat";
		String b="rohit";
		System.out.println("king kohli");
		System.out.println("rohit");
		Assert.assertTrue(a.equals(b));
		//Assert.assertFalse(a.equalsIgnoreCase(b));
		System.out.println("pant");
		System.out.println("rahul");
	}
	
	@Test
	public void update()
	{
		String c="gayle";
		String d="virat";
		assertNotSame(c, d);
		System.out.println("pant");	
	}
	
}
