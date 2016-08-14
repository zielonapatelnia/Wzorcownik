package com.zielonapatelnia.math;

public class CalculationFieldRectangle 
{
	
	private double a,b;
	
	public CalculationFieldRectangle(double a, double b)
	{
		this.a = a;
		this.b = b;
	}
	
	public String answerFieldRectangle()
	{
		
		double p = a * b;
		String answer = ("" + p);
		return answer;
		
	}
}
