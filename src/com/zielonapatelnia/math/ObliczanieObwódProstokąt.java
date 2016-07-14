package com.zielonapatelnia.math;

public class ObliczanieObwódProstokąt {
	
	double a,b;
	
	public ObliczanieObwódProstokąt(double a, double b)
	{
		this.a = a;
		this.b = b;
	}
	
		public String rozwiązanieObwódPoleKwadrat()
	{
			double p;
			String rozwiązanie;
			
			p = (2*a) + (2*b);
			rozwiązanie = ("" + p);
			
			return rozwiązanie;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
