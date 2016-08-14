package com.zielonapatelnia.math;

public class CalculationCircuitCircle
{
	
	private double d;
	
	public CalculationCircuitCircle(double d)
	{
		this.d = d;
	}
	
	public String answerCircuitCircle()
	{
		
		double p = (Math.PI * (d*d))/4;
		String result = ("" + p);
		return result;
	
	}
}
