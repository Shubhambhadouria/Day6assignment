package com.massai;

public class Prime{
	
public int[] findAndReturnPrimeNumbers(int[] inputArray){

	int[] ans = new int[7];
	int s = 0;
	for(int i=0; i<inputArray.length; i++)
	{
		int count=0;
		for(int j=1; j<inputArray[i]; j++)
		{
			if(inputArray[i]%j==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			ans[s]=inputArray[i];
			s++;
		}
	}
	return ans;
}
public static void main(String[] args){

	Prime p1 = new Prime();
	int[] arr = {10,12,5,50,11,14,15};
	int[] result = p1.findAndReturnPrimeNumbers(arr);
  
  
	for(int i=0; i<result.length; i++) {
		if(result[0]==0) {
			System.out.println("Prime number not found in the supplied Array");
			break;
		}
		else if(result[i]!=0) {
			System.out.println(result[i]);
		}
		else {
			break;
		}
		
	  }
  

 
}
}
