package com.zielonapatelnia.math;

public class CalculationCircuitRectangle 
{
	
	double a,b;
	
	public CalculationCircuitRectangle(double a, double b)
	{
		this.a = a;
		this.b = b;
	}
	
		
	public String answerCircuitRectangle()
	{
			
			double p = (2*a) + (2*b);
			String result = ("" + p);
			return result;
			
	}
}
