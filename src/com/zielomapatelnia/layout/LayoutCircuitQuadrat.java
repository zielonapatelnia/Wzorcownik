package com.zielomapatelnia.layout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.zielonapatelnia.math.CalculationCircuitQuadrart;

public class LayoutCircuitQuadrat implements ActionListener {
	
	JLabel jlNagłówek, jlWynik;
	JButton jbOblicz;
	JTextField jtfWynik, jtfWartość;

	public LayoutCircuitQuadrat()
	{
		
		
	
		
		JFrame oknoMiObwódKwadrat = new JFrame();
		oknoMiObwódKwadrat.setLayout(null);
		oknoMiObwódKwadrat.setSize(400, 400);
		oknoMiObwódKwadrat.setTitle("Obliczanie obwodu kwadratu");
		oknoMiObwódKwadrat.setDefaultCloseOperation(1);
		oknoMiObwódKwadrat.setVisible(true);
		
		jlNagłówek = new JLabel("Aby obliczyć obwód kwadratu podaj długość boku w cm");
		jlNagłówek.setBounds(20, 10, 380, 20);
		oknoMiObwódKwadrat.add(jlNagłówek);	
		
		jtfWartość = new JTextField();
		jtfWartość.setBounds(150, 60, 100, 40);
		oknoMiObwódKwadrat.add(jtfWartość);
		
		
		jbOblicz = new JButton("Oblicz !");
		jbOblicz.setBounds(50, 150, 300, 40);
		oknoMiObwódKwadrat.add(jbOblicz);
		jbOblicz.addActionListener(this);
		
		jlWynik = new JLabel("Wynik");
		jlWynik.setBounds(180, 210, 100, 20);
		oknoMiObwódKwadrat.add(jlWynik);
		
		jtfWynik = new JTextField();
		jtfWynik.setBounds(150, 260, 100, 40);
		oknoMiObwódKwadrat.add(jtfWynik);
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object z = e.getSource();
		
		if (z == jbOblicz)
		{
			double a = Double.parseDouble(jtfWartość.getText());
			CalculationCircuitQuadrart obiekt = new CalculationCircuitQuadrart(a);
			String rozwiązanie = obiekt.rozwiązanieObwódKwadrat();
			jtfWynik.setText(rozwiązanie);
		}
		
		
	}




	

}
