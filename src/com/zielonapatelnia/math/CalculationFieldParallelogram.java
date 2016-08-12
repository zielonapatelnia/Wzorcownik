package com.zielonapatelnia.math;

public class CalculationFieldParallelogram
{
	double a,b;
	
	public CalculationFieldParallelogram(double a, double b)
	{
		this.a = a;
		this.b = b;
		
	}
	
	public String rozwiązaniePoleRównoległobok()
	{
		double p;
		String rozwiązanie;
		
		p = a*b;
		rozwiązanie = ("" + p);
		return rozwiązanie;
		
		
	}
	

	
}
