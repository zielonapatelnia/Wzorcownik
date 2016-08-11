package com.zielonapatelnia.math;

public class ObliczaniePoleTrapez
{
	double a, b,c;
	
	ObliczaniePoleTrapez(double a,double b,double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public String rozwiązaniePoleTrapez()
	{
		double p;
		p = ((a+b)*c) / 2;
		String rozwiązanie = ("" + p);
		return rozwiązanie;
	}
	



}
