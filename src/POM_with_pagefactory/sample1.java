package POM_with_pagefactory;

public class sample1 {
	//hiding data from other class is nothing but encapsulation
	
	//step1:declared global variable with private access specifier
	private int a;
	
	//step2:initialize variable using constructor with public access specifier
	public sample1()
	{
		a=10;
	}
	
	//step3:use in regular method with public access specifier
	public void m1()
	{
		System.out.println(a*a);
	}
	

}
