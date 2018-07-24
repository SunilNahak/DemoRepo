package com.qa.test;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Demo_Test {
	
	@Test
	public void sum()
	{
		System.out.println("Addition Result: "); 
		int a = 10;
		int b = 20;
		Assert.assertEquals(30, a+b);
		
	}
	
	@Test
	public void Sub()
	{
		System.out.println("Substraction Result: "); 
		int a = 10;
		int b = 20;
		Assert.assertEquals(10, b-a);
	}
	@Test
	public void Mul()
	{
		System.out.println("Multiplication Result: "); 
		int a = 10;
		int b = 20;
		Assert.assertEquals(200, a*b);
		
	}
	@Test
	public void Div()
	{
		System.out.println("Division Result: "); 
		int a = 10;
		int b = 20;
		Assert.assertEquals(2, b/a);
	}

}
