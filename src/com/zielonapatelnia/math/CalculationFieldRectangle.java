package com.zielonapatelnia.math;

public class CalculationFieldRectangle {
	
	private double a,b;
	
	public CalculationFieldRectangle(double a, double b)
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
