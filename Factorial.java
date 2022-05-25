package com.massai;

public class Factorial {

	public static void main(String[] args) {
		
		
		if(args.length==1)
		{
			String s1 = args[0];
			int a = Integer.parseInt(s1);
			int b = 1;
			for(int i=a; i>=1; i--)
			{
				b = b*i;
			}
			System.out.println(b);
		}
		else if(args.length==2)
		{
			String s1 = args[0];
			String s2 = args[1];
			int a = Integer.parseInt(s1);
			int b = Integer.parseInt(s2);
			int c = a-b;
			if(a-b<0)
			{
				 c = -1 * (a-b); 
			}
			else
			{
				 c = a-b;
			}
			int d=1;
			for(int i=c; i>=1; i--)
			{
				d = d*i; 
			}
			System.out.println(d);
			
		}
		else if(args.length>=3)
		{
			System.out.println("error");
		}
		

	}

}
