package com.zielonapatelnia.math;

public class CalculationFieldCircle
{

	private double a;
	
	public CalculationFieldCircle(double a)
	{
	 this.a = a;	
	}
	
	public String answerFieldCircle()
	{
		
		a = a * Math.PI;
		String result = ("" +a);
		return result ;
		
	}
}
