package com.zielonapatelnia.math;

public class CalculationFieldQuadrat {
	
	private double a;
	
	public CalculationFieldQuadrat(double a)
	{
		this.a = a;
	}
	
	public String rozwiązaniePoleKwadrat()
	{
		String rozwiązanie;
		double p;
		
		p = a*a;
		rozwiązanie = ("" + p);
		
		
		return rozwiązanie;
	}
	

	

}
