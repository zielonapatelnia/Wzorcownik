package com.zielonapatelnia.math;

public class ObliczaniePoleKwadrat {
	
	private double a;
	
	public ObliczaniePoleKwadrat(double a)
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
