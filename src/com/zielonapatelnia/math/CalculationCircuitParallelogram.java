package com.zielonapatelnia.math;

public class CalculationCircuitParallelogram
{
	
	double a,b;
	public CalculationCircuitParallelogram(double a, double b)
	
	{
		this.a = a;
		this.b = b;
	}
	
	public String answerCircuitParallelogram()
	{
		
		double p = (2*a) + (2*b);
		String result = ("" + p);
		return result;
		
	}
}
