package com.ownpackage.addition;

public class Multiplication {
	int a; int b;
	public void multiply(int a,int b) 
	{
		StringBuffer sb = new StringBuffer();
		sb.append("The Multiplication of two Numbers : ").append(a*b);
		
		System.out.println(sb.toString());
	}
}
