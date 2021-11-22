package jUnitCodes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
class MinMaxFinderTest
{
		MinMaxFinder minmax=new MinMaxFinder();
	
	@Test
	void test()
	{
		int[]a1=new int[] {3,56};
		int[]a= {56,34,7,3,54,3,34,34,53};
		assertArrayEquals(a1,minmax.findMinMax(a));
	}
	@Test
	void test2()
	{
		int[]a2=new int[] {1,1};
		int[]b= {1,1,1,1,1,1};
		assertArrayEquals(a2,minmax.findMinMax(b));

	}
	@Test
	void test3()
	{
		int[]a3=new int[] {-1,33};
		int[]c= {-1,-9,-8,33,-2};
		assertArrayEquals(a3,minmax.findMinMax(c));

	}
	
}
