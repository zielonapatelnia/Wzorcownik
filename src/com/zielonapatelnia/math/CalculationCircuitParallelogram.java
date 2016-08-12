package com.zielonapatelnia.math;

public class CalculationCircuitParallelogram
{
	
	double a,b;
	public CalculationCircuitParallelogram(double a, double b)
	{
		this.a = a;
		this.b = b;
	}
	
	public String rozwiązanieObwódRównoległoboku()
	{
		double p;
		
		p = (2*a) + (2*b);
		String rozwiązanie = ("" + p);
		return rozwiązanie;
		
		
	}
	

	

}
