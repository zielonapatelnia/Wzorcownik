import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LayoutObwódProstokąt implements ActionListener {
	
	JLabel jlNagłówek, jlWynik;
	JButton jbOblicz;
	JTextField jtfWynik, jtfWartość1, jtWartość2;

	public LayoutObwódProstokąt()
	{
		
		
		JFrame oknoMiObwódProtokąt = new JFrame();
		oknoMiObwódProtokąt.setLayout(null);
		oknoMiObwódProtokąt.setSize(400, 400);
		oknoMiObwódProtokąt.setTitle("Obliczanie obwodu prosotkąta");
		oknoMiObwódProtokąt.setDefaultCloseOperation(1);
		oknoMiObwódProtokąt.setVisible(true);	
		
		jlNagłówek = new JLabel("Aby obliczyć obwód prostokąta podaj długość boku a i b w cm");
		jlNagłówek.setBounds(20, 10, 380, 20);
		oknoMiObwódProtokąt.add(jlNagłówek);	
		
		jtfWartość1 = new JTextField();
		jtfWartość1.setBounds(125, 60, 70, 40);
		oknoMiObwódProtokąt.add(jtfWartość1);
		
		jtWartość2 = new JTextField();
		jtWartość2.setBounds(225, 60, 70, 40);
		oknoMiObwódProtokąt.add(jtWartość2);
		
		
		jbOblicz = new JButton("Oblicz !");
		jbOblicz.setBounds(50, 150, 300, 40);
		oknoMiObwódProtokąt.add(jbOblicz);
		jbOblicz.addActionListener(this);
		
		jlWynik = new JLabel("Wynik");
		jlWynik.setBounds(180, 210, 100, 20);
		oknoMiObwódProtokąt.add(jlWynik);
		
		jtfWynik = new JTextField();
		jtfWynik.setBounds(150, 260, 100, 40);
		oknoMiObwódProtokąt.add(jtfWynik);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
			Object z = e.getSource();
			
			if (z == jbOblicz)
			{
				Double a = Double.parseDouble(jtfWartość1.getText());
				Double b = Double.parseDouble(jtWartość2.getText());
				
				ObliczanieObwódProstokąt wynik = new ObliczanieObwódProstokąt(a,b);
				String rozwiązanie = wynik.rozwiązanieObwódPoleKwadrat();
				jtfWynik.setText(rozwiązanie);
				
				
			}

		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
