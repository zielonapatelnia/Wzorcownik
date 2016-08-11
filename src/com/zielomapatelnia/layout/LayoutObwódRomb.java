package com.zielomapatelnia.layout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.zielonapatelnia.math.ObliczanieObwódRomb;

public class LayoutObwódRomb implements ActionListener {
	
	JLabel jlNagłówek, jlWynik;
	JButton jbOblicz;
	JTextField jtfWynik, jtfWartość1;
	
	public LayoutObwódRomb()
	{
		
		
		JFrame oknoMiObwódRomb = new JFrame();
		oknoMiObwódRomb.setLayout(null);
		oknoMiObwódRomb.setSize(400, 400);
		oknoMiObwódRomb.setTitle("Obliczanie obwodu Rombu");
		oknoMiObwódRomb.setDefaultCloseOperation(1);
		oknoMiObwódRomb.setVisible(true);
		
		
		jlNagłówek = new JLabel("Aby obliczyć pole rombu podaj długość boku a");
		jlNagłówek.setBounds(20, 10, 400, 20);
		oknoMiObwódRomb.add(jlNagłówek);	
		
		jtfWartość1 = new JTextField();
		jtfWartość1.setBounds(50, 60, 70, 40);
		oknoMiObwódRomb.add(jtfWartość1);
		
	
		
	
		
		jbOblicz = new JButton("Oblicz !");
		jbOblicz.setBounds(50, 150, 300, 40);
		oknoMiObwódRomb.add(jbOblicz);
		jbOblicz.addActionListener(this);
		
		jlWynik = new JLabel("Wynik");
		jlWynik.setBounds(180, 210, 100, 20);
		oknoMiObwódRomb.add(jlWynik);
		
		jtfWynik = new JTextField();
		jtfWynik.setBounds(150, 260, 100, 40);
		oknoMiObwódRomb.add(jtfWynik);
	}

	
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
			Object z = e.getSource();
			
			if (z == jbOblicz)
			{
				double a = Double.parseDouble(jtfWartość1.getText());
				
				ObliczanieObwódRomb obiekt = new ObliczanieObwódRomb(a);
				String wynik = obiekt.obliczanieObwódRomb();
				jtfWynik.setText(wynik);
				
				
			}
		
	}




}
