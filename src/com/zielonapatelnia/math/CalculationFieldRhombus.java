package com.zielonapatelnia.math;

public class CalculationFieldRhombus
{

	double a,b;
	
	public CalculationFieldRhombus(double a,double b)
	{
		this.a = a;
		this.b =b;
	}
	
	
	public String answerFieldRhombus()
	{
		double p;
		String rozwiązanie;
		
		p = (a*b)/2;
		rozwiązanie = ("" + p);
		return rozwiązanie;
		
	}
	
	
}
