
public class ObliczaniePoleTrójkąt {
	
	double a;
	
	
	ObliczaniePoleTrójkąt(double a)
	{
		this.a = a;
	}
	
	public String rozwiązaniePoleTrójkąt()
	{
		double p;
		String rozwiązanie;
		
		p = (a*a) * Math.sqrt(3)/4;
		rozwiązanie = ("" + p);
		
		
		return rozwiązanie;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
