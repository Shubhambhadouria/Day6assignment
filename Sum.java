package com.massai;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a = {
				{1,2,3},
				{4,5,6},
				{7,8,9}  };
		
		for(int father=0; father<a.length; father++)
		{
			int sum = 0;
			for(int son=0; son<a.length; son++)
			{
				if(a[son][father]%2==0)
				{
					sum=sum+a[son][father];
				}
			}
			System.out.println(sum);
		}
	}
}
