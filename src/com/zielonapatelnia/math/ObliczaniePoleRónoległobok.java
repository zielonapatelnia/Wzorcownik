package com.zielonapatelnia.math;

public class ObliczaniePoleRónoległobok
{
	double a,b;
	
	public ObliczaniePoleRónoległobok(double a, double b)
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
