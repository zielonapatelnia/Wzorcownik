
public class ObliczanieObwódTrójkąt {
	
	
	private double a,b,c;
	
	ObliczanieObwódTrójkąt(double a, double b, double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
		
		public String obliczanieObwódTrójkąt()
		{
			String rozwiązanie;
			double p;
			
			p = a+b+c;
			rozwiązanie = ("" + p);
			
			return rozwiązanie;
			
			
		}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
