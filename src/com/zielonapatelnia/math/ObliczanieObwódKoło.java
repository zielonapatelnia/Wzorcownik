package com.zielonapatelnia.math;

public class ObliczanieObwódKoło {
	
	private double d;
	
	public ObliczanieObwódKoło(double d)
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
