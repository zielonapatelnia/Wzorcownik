package com.zielomapatelnia.layout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.zielonapatelnia.math.CalculationFieldRectangle;

public class LayoutFieldRectangle implements ActionListener  {
	
	JLabel jlNagłówek, jlWynik;
	JButton jbOblicz;
	JTextField jtfWynik, jtfWartość1, jtWartość2;
	
	
	public LayoutFieldRectangle()
	{
		
		
		JFrame oknoMiPoleProstokąt = new JFrame();
		oknoMiPoleProstokąt.setLayout(null);
		oknoMiPoleProstokąt.setSize(400, 400);
		oknoMiPoleProstokąt.setTitle("Obliczanie pola protokąta");
		oknoMiPoleProstokąt.setDefaultCloseOperation(1);
		oknoMiPoleProstokąt.setVisible(true);	
		
		jlNagłówek = new JLabel("Aby obliczyć pole prostokąta podaj długość boku a i b w cm");
		jlNagłówek.setBounds(20, 10, 380, 20);
		oknoMiPoleProstokąt.add(jlNagłówek);	
		
		jtfWartość1 = new JTextField();
		jtfWartość1.setBounds(125, 60, 70, 40);
		oknoMiPoleProstokąt.add(jtfWartość1);
		
		jtWartość2 = new JTextField();
		jtWartość2.setBounds(225, 60, 70, 40);
		oknoMiPoleProstokąt.add(jtWartość2);
		
		
		jbOblicz = new JButton("Oblicz !");
		jbOblicz.setBounds(50, 150, 300, 40);
		oknoMiPoleProstokąt.add(jbOblicz);
		jbOblicz.addActionListener(this);
		
		jlWynik = new JLabel("Wynik");
		jlWynik.setBounds(180, 210, 100, 20);
		oknoMiPoleProstokąt.add(jlWynik);
		
		jtfWynik = new JTextField();
		jtfWynik.setBounds(150, 260, 100, 40);
		oknoMiPoleProstokąt.add(jtfWynik);
	}

	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
			Object z = e.getSource();
			
			if (z == jbOblicz)
			{
				double a = Double.parseDouble(jtfWartość1.getText());
				double b = Double.parseDouble(jtWartość2.getText());
				
				CalculationFieldRectangle obiekt = new CalculationFieldRectangle(a,b);
				String wynik = obiekt.rozwiązaniePoleProtokąt();
				jtfWynik.setText(wynik);
			}
		
	}


}