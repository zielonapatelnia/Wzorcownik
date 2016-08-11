package com.zielomapatelnia.layout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.zielonapatelnia.math.ObliczaniePoleKwadrat;

public class LayoutPoleKwadrat implements ActionListener {
	
	JLabel jlNagłówek, jlWynik;
	JButton jbOblicz;
	JTextField jtfWynik, jtfWartość;
	
	public LayoutPoleKwadrat()
	{
		
		
		JFrame oknoMiPoleKwadrat = new JFrame();
		oknoMiPoleKwadrat.setLayout(null);
		oknoMiPoleKwadrat.setSize(400, 400);
		oknoMiPoleKwadrat.setTitle("Obliczanie pola kwadratu");
		oknoMiPoleKwadrat.setDefaultCloseOperation(1);
		oknoMiPoleKwadrat.setVisible(true);
		
		jlNagłówek = new JLabel("Aby obliczyć pole kwadratu podaj długość boku w cm");
		jlNagłówek.setBounds(20, 10, 380, 20);
		oknoMiPoleKwadrat.add(jlNagłówek);	
		
		jtfWartość = new JTextField();
		jtfWartość.setBounds(150, 60, 100, 40);
		oknoMiPoleKwadrat.add(jtfWartość);
		
		
		jbOblicz = new JButton("Oblicz !");
		jbOblicz.setBounds(50, 150, 300, 40);
		oknoMiPoleKwadrat.add(jbOblicz);
		jbOblicz.addActionListener(this);
		
		jlWynik = new JLabel("Wynik");
		jlWynik.setBounds(180, 210, 100, 20);
		oknoMiPoleKwadrat.add(jlWynik);
		
		jtfWynik = new JTextField();
		jtfWynik.setBounds(150, 260, 100, 40);
		oknoMiPoleKwadrat.add(jtfWynik);
		
		
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
			Object z = e.getSource();
			
			if (z == jbOblicz)
			{
				double a = Double.parseDouble(jtfWartość.getText());
				
				ObliczaniePoleKwadrat obliczamPoleKwardatu = new ObliczaniePoleKwadrat(a);
				String rozwiązanie = obliczamPoleKwardatu.rozwiązaniePoleKwadrat();
				jtfWynik.setText(rozwiązanie);
				
			}
		
	}





}
