package com.zielonapatelnia.math;

public class ObliczaniePoleKoło {

	private double a;
	
	public ObliczaniePoleKoło(double a)
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
	
	
	
	public static void main(String[] args) {


		
	}

}
