package com.zielonapatelnia.math;

public class CalculationCircuitTrapeze


{
	double a,b,c,d;
	
	public CalculationCircuitTrapeze(double a, double b, double c, double d)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	public String rozwiązanieObwódTrapez()
	{
		double o;
		String rozwiązanie;
		
		o = a+b+c+d;
		rozwiązanie = ("" + o);
		return rozwiązanie;
		
	}
	
	
}