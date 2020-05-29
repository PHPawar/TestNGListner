package testCases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import utility.CommonFunctions;

public class TestCase2 {
	@Test
	public void testcase21()
	{
		assertTrue(true);
		System.out.println("Test Case one passed");
	}
	@Test
	public void testcase22()
	{
		assertTrue(true);
		System.out.println("Test Case one passed");
	}
	
	@Test
	public void testcase23()
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
