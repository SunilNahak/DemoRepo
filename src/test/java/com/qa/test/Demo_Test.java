package com.qa.test;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Demo_Test {
	
	@Test
	public void sum()
	{

		int a = 10;
		int b = 20;
		System.out.println("Addition Result:" + (a+b)); 
		Assert.assertEquals(30, a+b);
		
	}
	
	@Test
	public void Sub()
	{
		int a = 10;
		int b = 20;
		System.out.println("Substraction Result:" + (b-a)); 
		Assert.assertEquals(10, b-a);
	}
	@Test
	public void Mul()
	{

		int a = 10;
		int b = 20;
		System.out.println("Multiplication Result:" + (a*b)); 
		Assert.assertEquals(200, a*b);
		
	}
	@Test
	public void Div()
	{

		int a = 10;
		int b = 20;
		System.out.println("Division Result:"+ (b/a)); 
		Assert.assertEquals(2, b/a);
	}

}
