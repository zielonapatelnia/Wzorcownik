package com.zielomapatelnia.layout;
import com.zielonapatelnia.math.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.zielonapatelnia.math.ObliczaniePoleTrójkąt;

public class LayoutPoleTrójkąt implements ActionListener{
	
	
	JLabel jlNagłówek, jlWynik;
	JButton jbOblicz;
	JTextField jtfWynik, jtfWartość1;
	
	public LayoutPoleTrójkąt()
	{
		
		
		JFrame oknoMiPoleTrójkąt = new JFrame();
		oknoMiPoleTrójkąt.setLayout(null);
		oknoMiPoleTrójkąt.setSize(400, 400);
		oknoMiPoleTrójkąt.setTitle("Obliczanie pola trójkąta równobocznego");
		oknoMiPoleTrójkąt.setDefaultCloseOperation(1);
		oknoMiPoleTrójkąt.setVisible(true);	
		
		
		jlNagłówek = new JLabel("Aby obliczyć obwód trójkąta podaj długość boku a w cm");
		jlNagłówek.setBounds(20, 10, 380, 20);
		oknoMiPoleTrójkąt.add(jlNagłówek);	
		
		jtfWartość1 = new JTextField();
		jtfWartość1.setBounds(125, 60, 70, 40);
		oknoMiPoleTrójkąt.add(jtfWartość1);
		
		
		
		jbOblicz = new JButton("Oblicz !");
		jbOblicz.setBounds(50, 150, 300, 40);
		oknoMiPoleTrójkąt.add(jbOblicz);
		jbOblicz.addActionListener(this);
		
		jlWynik = new JLabel("Wynik");
		jlWynik.setBounds(180, 210, 100, 20);
		oknoMiPoleTrójkąt.add(jlWynik);
		
		jtfWynik = new JTextField();
		jtfWynik.setBounds(150, 260, 100, 40);
		oknoMiPoleTrójkąt.add(jtfWynik);
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		Object z = e.getSource();
		
		if (z == jbOblicz)
		{
			double b = Double.parseDouble(jtfWartość1.getText());
			
			ObliczaniePoleTrójkąt obiekt = new ObliczaniePoleTrójkąt(b);
			String rozwiązanie = obiekt.rozwiązaniePoleTrójkąt();
			jtfWynik.setText(rozwiązanie);
			
			
			
		}
		
		

		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
