package jUnitCodes;

public class Program2 
{
	int array[]= {56,34,7,3,54,3,34,34,53};
	int max()
	{
	int max=Integer.MAX_VALUE;
	for(int i=0;i<array.length;i++)
	{
		if(array[i]<max)
		{
			max=array[i];
		}
	}
	return max;
	}
	int min=Integer.MIN_VALUE;
	{
		int min=array[0];
	for(int i=0;i<array.length;i++)
	{
		if(array[i]<min)
		{
			min=array[i];
		}
	}
	//return min;
	
	}

}
