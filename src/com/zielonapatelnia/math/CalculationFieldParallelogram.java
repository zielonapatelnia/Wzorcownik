package com.zielonapatelnia.math;

public class CalculationFieldParallelogram
{
	double a,b;
	
	public CalculationFieldParallelogram(double a, double b)
	{
		this.a = a;
		this.b = b;
		
	}
	
	public String answerFieldParallelogram()
	{
		
		double p = a*b;
		String result = ("" + p);
		return result;
		
	}
}
