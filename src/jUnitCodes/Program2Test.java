package jUnitCodes;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Program2Test 
{
	Program2 p2=new Program2();

	@Test
	void test() 
	{
			int[]a1=new int[] {56};
			int[]a= {56,34,7,3,54,3,34,34,53};
			assertArrayEquals(a1,a);
	}
	@Test
	void test2() 
	{
			int[]a2=new int[] {3};
			int[]a= {56,34,7,3,54,3,34,34,53};
			assertArrayEquals(a2,a);
	}

}
