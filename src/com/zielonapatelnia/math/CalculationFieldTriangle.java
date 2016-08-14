package com.zielonapatelnia.math;

public class CalculationFieldTriangle 
{
	
	double a;
	
	
	public CalculationFieldTriangle(double a)
	{
		this.a = a;
	}
	
	public String answerFieldTriangle()
	{
		
		double p = (a*a) * Math.sqrt(3)/4;
		String result = ("" + p);
		return result;
		
	}
}
