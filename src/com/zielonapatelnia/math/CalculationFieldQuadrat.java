package com.zielonapatelnia.math;

public class CalculationFieldQuadrat 
{
	
	private double a;
	
	public CalculationFieldQuadrat(double a)
	{
		this.a = a;
	}
	
	public String answerFieldQuadrat()
	{
		
		double p = a*a;
		String result = ("" + p);
		return result;
		
	}
}
