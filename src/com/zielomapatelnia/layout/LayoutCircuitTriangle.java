package com.zielomapatelnia.layout;
import  com.zielonapatelnia.math.CalculationCircuitTriangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.zielonapatelnia.math.CalculationCircuitTriangle;

public class LayoutCircuitTriangle implements ActionListener {
	
	
	JLabel jlNagłówek, jlWynik;
	JButton jbOblicz;
	JTextField jtfWynik, jtfWartość1, jtfWartość2, jtfWartość3;
	
	public LayoutCircuitTriangle()
	{

		
		
		JFrame oknoMiObwódTrójkąt = new JFrame();
		oknoMiObwódTrójkąt.setLayout(null);
		oknoMiObwódTrójkąt.setSize(400, 400);
		oknoMiObwódTrójkąt.setTitle("Obliczanie obwodu trójkąta");
		oknoMiObwódTrójkąt.setDefaultCloseOperation(1);
		oknoMiObwódTrójkąt.setVisible(true);	
		
		jlNagłówek = new JLabel("Aby obliczyć obwód trójkąta podaj długość boku a,b i c w cm");
		jlNagłówek.setBounds(20, 10, 400, 20);
		oknoMiObwódTrójkąt.add(jlNagłówek);	
		
		jtfWartość1 = new JTextField();
		jtfWartość1.setBounds(50, 60, 70, 40);
		oknoMiObwódTrójkąt.add(jtfWartość1);
		
		jtfWartość2 = new JTextField();
		jtfWartość2.setBounds(150, 60, 70, 40);
		oknoMiObwódTrójkąt.add(jtfWartość2);
		
		jtfWartość3 = new JTextField();
		jtfWartość3.setBounds(250, 60, 70, 40);
		oknoMiObwódTrójkąt.add(jtfWartość3);
		
		jbOblicz = new JButton("Oblicz !");
		jbOblicz.setBounds(50, 150, 300, 40);
		oknoMiObwódTrójkąt.add(jbOblicz);
		jbOblicz.addActionListener(this);
		
		jlWynik = new JLabel("Wynik");
		jlWynik.setBounds(180, 210, 100, 20);
		oknoMiObwódTrójkąt.add(jlWynik);
		
		jtfWynik = new JTextField();
		jtfWynik.setBounds(150, 260, 100, 40);
		oknoMiObwódTrójkąt.add(jtfWynik);
		
	}
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
			Object z = e.getSource();
			
			if (z == jbOblicz)
			{
				double a = Double.parseDouble(jtfWartość1.getText());
				double b = Double.parseDouble(jtfWartość2.getText());
				double c = Double.parseDouble(jtfWartość3.getText());
				
				CalculationCircuitTriangle obiekt = new CalculationCircuitTriangle(a,b,c);
				String rozwiązanie = obiekt.obliczanieObwódTrójkąt();
				jtfWynik.setText(rozwiązanie);
			}
	}



}
