package com.massai;

public class Prime{
public int[] findAndReturnPrimeNumbers(int[] inputArray){

			
	for(int i=0; i<inputArray.length; i++)
	{
		int count=0;
		for(int j=1; j<inputArray[i]; j++)
		{
			if(inputArray[i]%j==0)
			{
				count++;
			}
			if(count>2)
			{
				return 0;
			}
			else
			{
			
			}
		}
	}
}
public static void main(String[] args){

 int[] arr = {10,12,5,50,11,14,15};

 
  Prime p1 = new Prime();
  p1.findAndReturnPrimeNumbers(arr);
 
}
}
