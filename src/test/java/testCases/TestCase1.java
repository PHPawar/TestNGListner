package testCases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1 {
	@Test
	public void testcase1()
	{
		assertTrue(true);
		System.out.println("Test Case one passed");
	}
	@Test
	public void testcase2()
	{
		assertTrue(true);
		System.out.println("Test Case one passed");
	}
	
	@Test
	public void testcase3()
	{
		assertTrue(false);
		System.out.println("Test Case one passed");
	}
	
	@Test
	public void testcase4()
	{
		assertTrue(false);
		System.out.println("Test Case one passed");
	}
	

}
