import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LayoutPoleKoło  extends JFrame implements ActionListener{

	private JLabel jlNagłówek, jlWynik;
	private JButton jbOblicz;
	private	JTextField jtfWynik, jtfWartość;
	
	
	public LayoutPoleKoło()
	{
		
		
		JFrame oknoMiPoleKoło = new JFrame();
		oknoMiPoleKoło.setLayout(null);
		
		
		oknoMiPoleKoło.setSize(400, 400);
		oknoMiPoleKoło.setTitle("Obliczanie pola koła");
		oknoMiPoleKoło.setDefaultCloseOperation(1);
		oknoMiPoleKoło.setVisible(true);
		
		jlNagłówek = new JLabel("Aby obliczyć pole koła podaj promień w cm");
		jlNagłówek.setBounds(70, 10, 300, 20);
		oknoMiPoleKoło.add(jlNagłówek);	
		
		jtfWartość = new JTextField();
		jtfWartość.setBounds(150, 60, 100, 40);
		oknoMiPoleKoło.add(jtfWartość);
		
		
		jbOblicz = new JButton("Oblicz !");
		jbOblicz.setBounds(50, 150, 300, 40);
		oknoMiPoleKoło.add(jbOblicz);
		jbOblicz.addActionListener(this);
		
		jlWynik = new JLabel("Wynik");
		jlWynik.setBounds(180, 210, 100, 20);
		oknoMiPoleKoło.add(jlWynik);
		
		jtfWynik = new JTextField();
		jtfWynik.setBounds(150, 260, 100, 40);
		oknoMiPoleKoło.add(jtfWynik);
	}
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object z = e.getSource();
		
		if (z == jbOblicz)
		{
			double a = Double.parseDouble(jtfWartość.getText());
			
			
			ObliczaniePoleKoło obliczamPoleKoła = new ObliczaniePoleKoło(a);
			String rozwiązanie = obliczamPoleKoła.rozwiązaniePoleKoło();
			jtfWynik.setText(rozwiązanie);
		
			
			
			
		}
		
		
	}






	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
