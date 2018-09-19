package com.cg.test;
import junit.framework.Assert;

import org.junit.Test;

import com.cg.demo.Calculator;

public class TestCalculator {
	@Test
	public void test_add()
	{
		Calculator calc =new Calculator();
		int res=calc.add(3,4);
		Assert.assertEquals(7,res);
	}
	@Test
	public void test_subtract()
	{
		Calculator calc =new Calculator();
		int res=calc.subtract(6,2);
		Assert.assertEquals(7,res);
	}
	public void test_multiply()
	{
		Calculator calc =new Calculator();
		int res=calc.multiply(2,4);
		Assert.assertEquals(8,res);
		
	}
	public void test_calcSquare()
	{
		Calculator calc =new Calculator();
		int res=calc.add(3);
		Assert.assertEquals(9,res);
	}

}
