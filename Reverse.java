package com.massai;

import java.util.Scanner;

class Reverse{
	public static String reversString(char[] input){
		String bag="";
		for(int i=input.length-1; i>=0; i--)
		{
			bag=bag+input[i];
		}
		return bag;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		String orignalString = sc.next();
		char[] chararr = orignalString.toCharArray();
		String result = reversString(chararr);
		System.out.println("Original String is :"+ orignalString);
		System.out.println("Reversed String is :"+ result);
		sc.close();
	}
}