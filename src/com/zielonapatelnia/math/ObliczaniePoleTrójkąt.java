package com.zielonapatelnia.math;

public class ObliczaniePoleTrójkąt {
	
	double a;
	
	
	public ObliczaniePoleTrójkąt(double a)
	{
		this.a = a;
	}
	
	public String rozwiązaniePoleTrójkąt()
	{
		double p;
		String rozwiązanie;
		
		p = (a*a) * Math.sqrt(3)/4;
		rozwiązanie = ("" + p);
		
		
		return rozwiązanie;
	}

	
}
