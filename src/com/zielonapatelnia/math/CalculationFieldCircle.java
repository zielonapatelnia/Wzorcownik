package com.zielonapatelnia.math;

public class CalculationFieldCircle {

	private double a;
	
	public CalculationFieldCircle(double a)
	{
	 this.a = a;	
		
	}
	
	



	public String rozwiązaniePoleKoło()
	{
		String rozwiązanie = "";
		a = a * Math.PI;
		rozwiązanie = ("" +a);
		return rozwiązanie ;
		
	}
	
	
	
	

}
