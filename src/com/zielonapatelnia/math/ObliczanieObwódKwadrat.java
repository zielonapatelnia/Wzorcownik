package com.zielonapatelnia.math;

public class ObliczanieObwódKwadrat {
	
	double a;
	
	public ObliczanieObwódKwadrat(double a)
	{
		this.a = a;
	}

	public String rozwiązanieObwódKwadrat()
	{
		double o;
		String rozwiązanie;
		
		o = 4 * a;
		rozwiązanie = ("" + o);
		
		
		return rozwiązanie;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
