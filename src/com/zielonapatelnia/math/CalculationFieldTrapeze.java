package com.zielonapatelnia.math;

public class CalculationFieldTrapeze
{
	double a, b,c;
	
	public CalculationFieldTrapeze(double a,double b,double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public String answerFieldTrapeze()
	{
		
		double p = ((a+b)*c) / 2;
		String answer = ("" + p);
		return answer;
		
	}
	



}
