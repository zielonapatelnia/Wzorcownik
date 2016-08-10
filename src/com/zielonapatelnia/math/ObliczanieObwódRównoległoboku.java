package com.zielonapatelnia.math;

public class ObliczanieObwódRównoległoboku
{
	
	double a,b;
	public ObliczanieObwódRównoległoboku(double a, double b)
	{
		this.a = a;
		this.b = b;
	}
	
	public String rozwiązanieObwódRównoległoboku()
	{
		double p;
		
		p = (2*a) + (2*b);
		String rozwiązanie = ("" + p);
		return rozwiązanie;
		
		
	}
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
