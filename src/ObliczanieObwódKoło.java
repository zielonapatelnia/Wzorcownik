
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
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
