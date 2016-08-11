package com.zielonapatelnia.math;

public class ObliczaniePoleRomb
{

	double a,b;
	
	public ObliczaniePoleRomb(double a,double b)
	{
		this.a = a;
		this.b =b;
	}
	
	
	public String rozwiązaniePoleRomb()
	{
		double p;
		String rozwiązanie;
		
		p = (a*b)/2;
		rozwiązanie = ("" + p);
		return rozwiązanie;
		
	}
	
	
}
