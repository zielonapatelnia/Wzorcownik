package com.zielonapatelnia.math;

public class CalculationCircuitCircle {
	
	private double d;
	
	public CalculationCircuitCircle(double d)
	{
		this.d = d;
	}
	
	
	public String rozwiązanieObwódKoło()
	{
		String rozwiązanie = "";
		double p;
		
		p = (Math.PI * (d*d))/4;
		rozwiązanie = ("" + p);
		
		return rozwiązanie;
	}
	

	

}
