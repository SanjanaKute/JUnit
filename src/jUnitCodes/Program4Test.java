package jUnitCodes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Program4Test 
{
	Program4 p;
	
	@BeforeAll
	public static void beforeall()
	{
		System.out.println("Welcome...!!");
	}
	@BeforeEach
	public void init()
	{
		p=new Program4();
		System.out.println("Iinitializing method");
	}
	
	@DisplayName("Adding two positive numbers")
	@Test
	void test() 
	{
		new Program4();
		int sum=p.add(12, 10);
		System.out.println("The sum of two positive numbers is: "+sum);
	}

	@Test
	@DisplayName("Adding two negative numbers")
//	@Disabled//this is used to disabled any testcase. similary to commenting out.
	void test2()
	{
		new Program4();
		int sum=p.add(-12, -10);
		System.out.println("The sum of two negative numbers is: "+sum);

	}
	@DisplayName("Subtracting two numbers")
	@Test
	void test3() 
	{
		new Program4();
		int sum=p.subtract(12, 10);
		System.out.println("The sum of two positive numbers is: "+sum);
	}
	@DisplayName("multiplying two numbers")
	@Test
	void test4() 
	{
		new Program4();
		int sum=p.multiply(12, 10);
		System.out.println("The sum of two positive numbers is: "+sum);
	}
	@DisplayName("Dividing two numbers")
	@Test
	void test5() 
	{
		new Program4();
		int sum=p.divide(12, 10);
		System.out.println("The sum of two positive numbers is: "+sum);
	}
	
	@AfterEach
	public void aftereach()
	{
		System.out.println("Method Executed successfully ");
	}
	
	@AfterAll
	public static void afterall()
	{
		System.out.println("Exit...");
	}
}
