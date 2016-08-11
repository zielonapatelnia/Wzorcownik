package com.zielonapatelnia.math;

public class ObliczaniePolaProstokąta {
	
	private double a,b;
	
	public ObliczaniePolaProstokąta(double a, double b)
	{
		this.a = a;
		this.b = b;
	}
	
	public String rozwiązaniePoleProtokąt()
	{
		double p;
		String rozwiązanie;
		
		p = a * b;
		rozwiązanie = ("" + p);
		return rozwiązanie;
	}

	

}
