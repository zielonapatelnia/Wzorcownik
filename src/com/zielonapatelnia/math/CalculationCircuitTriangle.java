package com.zielonapatelnia.math;

public class CalculationCircuitTriangle 
{
	private double a,b,c;
	
	public CalculationCircuitTriangle(double a, double b, double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
		
		public String answerCircuitTriangle()
		{
			
			double p = a+b+c;
			String result = ("" + p);
			return result;
			
		}
}
