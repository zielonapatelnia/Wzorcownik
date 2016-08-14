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
	
	public String answerCircuitTrapeze()
	{
		
		double o = a+b+c+d;
		String result = ("" + o);
		return result;
		
	}
}
