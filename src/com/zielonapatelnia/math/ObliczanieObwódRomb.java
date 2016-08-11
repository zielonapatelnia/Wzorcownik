package com.zielonapatelnia.math;

public class ObliczanieObwódRomb
{
	
	public double a;
	
	public ObliczanieObwódRomb(double a)
	{
		this.a = a;
	}

	public String obliczanieObwódRomb()
	{
		double o;
		String rezultat;
		
		o = 4*a;
		rezultat = ("" + o);
		return rezultat;
		
	}
	
	
}
