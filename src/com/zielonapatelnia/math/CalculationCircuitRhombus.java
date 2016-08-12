package com.zielonapatelnia.math;

public class CalculationCircuitRhombus
{
	
	public double a;
	
	public CalculationCircuitRhombus(double a)
	{
		this.a = a;
	}

	public String obliczanieObwódRomb()
	{
		double o;
		String rezultat;
		
		o = 4*a;
		rezultat = ("" + o);
		return rezultat;
		
	}
	
	
}
