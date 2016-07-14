package com.zielomapatelnia.layout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.zielonapatelnia.math.ObliczanieObwódKoło;

public class LayoutObwódKoło implements ActionListener {

	JLabel jlNagłówek, jlWynik;
	JButton jbOblicz;
	JTextField jtfWynik, jtfWartość;
	
	public LayoutObwódKoło()
	{
	
	
	
	JFrame oknoMiObwódKoło = new JFrame();
	oknoMiObwódKoło.setLayout(null);

	
	
	oknoMiObwódKoło.setSize(400, 400);
	oknoMiObwódKoło.setTitle("Obliczanie obwodu koła");
	oknoMiObwódKoło.setDefaultCloseOperation(1);
	oknoMiObwódKoło.setVisible(true);
	
	jlNagłówek = new JLabel("Aby obliczyć obwód koła podaj średnicę koła w cm");
	jlNagłówek.setBounds(70, 10, 300, 20);
	oknoMiObwódKoło.add(jlNagłówek);	
	
	jtfWartość = new JTextField();
	jtfWartość.setBounds(150, 60, 100, 40);
	oknoMiObwódKoło.add(jtfWartość);
	
	
	jbOblicz = new JButton("Oblicz !");
	jbOblicz.setBounds(50, 150, 300, 40);
	oknoMiObwódKoło.add(jbOblicz);
	jbOblicz.addActionListener(this);
	
	jlWynik = new JLabel("Wynik");
	jlWynik.setBounds(180, 210, 100, 20);
	oknoMiObwódKoło.add(jlWynik);
	
	jtfWynik = new JTextField();
	jtfWynik.setBounds(150, 260, 100, 40);
	oknoMiObwódKoło.add(jtfWynik);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object z = e.getSource();
		if (z == jbOblicz)
		{
			double a = Double.parseDouble(jtfWartość.getText());
			
			ObliczanieObwódKoło rezultat = new ObliczanieObwódKoło(a);
			String wynik = rezultat.rozwiązanieObwódKoło();
			jtfWynik.setText(wynik);
			
			
			
			
		}
		
		
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
