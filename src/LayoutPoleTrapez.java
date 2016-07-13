import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LayoutPoleTrapez {

	public LayoutPoleTrapez()
	{
		JLabel jlNagłówek, jlWynik;
		JButton jbOblicz;
		JTextField jtfWynik, jtfWartość1,jtfWartość2, jtfWartość3, jtfWartość4;
		
		
		JFrame oknoMiObwódTrapzez = new JFrame();
		oknoMiObwódTrapzez.setLayout(null);
		oknoMiObwódTrapzez.setSize(400, 400);
		oknoMiObwódTrapzez.setTitle("Obliczanie obwodu trapeza");
		oknoMiObwódTrapzez.setDefaultCloseOperation(1);
		oknoMiObwódTrapzez.setVisible(true);	
		
		jlNagłówek = new JLabel("Aby obliczyć obwód trapezu podaj długość boku a,b,c,d");
		jlNagłówek.setBounds(20, 10, 400, 20);
		oknoMiObwódTrapzez.add(jlNagłówek);	
		
		jtfWartość1 = new JTextField();
		jtfWartość1.setBounds(50, 60, 70, 40);
		oknoMiObwódTrapzez.add(jtfWartość1);
		
		jtfWartość2 = new JTextField();
		jtfWartość2.setBounds(150, 60, 70, 40);
		oknoMiObwódTrapzez.add(jtfWartość2);
		
		jtfWartość3 = new JTextField();
		jtfWartość3.setBounds(250, 60, 70, 40);
		oknoMiObwódTrapzez.add(jtfWartość3);
		
		jtfWartość4 = new JTextField();
		jtfWartość4.setBounds(350, 60, 70, 40);
		
		jbOblicz = new JButton("Oblicz !");
		jbOblicz.setBounds(50, 150, 300, 40);
		oknoMiObwódTrapzez.add(jbOblicz);
		
		jlWynik = new JLabel("Wynik");
		jlWynik.setBounds(180, 210, 100, 20);
		oknoMiObwódTrapzez.add(jlWynik);
		
		jtfWynik = new JTextField();
		jtfWynik.setBounds(150, 260, 100, 40);
		oknoMiObwódTrapzez.add(jtfWynik);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
