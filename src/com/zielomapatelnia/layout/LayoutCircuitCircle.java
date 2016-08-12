package com.zielomapatelnia.layout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.zielonapatelnia.math.CalculationCircuitCircle;

public class LayoutCircuitCircle implements ActionListener {

	JLabel jlHeading, jlResult;
	JButton jbCalculate;
	JTextField jtfResult, jtfValue;
	
	public LayoutCircuitCircle()
	{
	
	
	
	JFrame oknoMiObwódKoło = new JFrame();
	oknoMiObwódKoło.setLayout(null);

	
	
	oknoMiObwódKoło.setSize(400, 400);
	oknoMiObwódKoło.setTitle("Obliczanie obwodu koła");
	oknoMiObwódKoło.setDefaultCloseOperation(1);
	oknoMiObwódKoło.setVisible(true);
	
	jlHeading = new JLabel("Aby obliczyć obwód koła podaj średnicę koła w cm");
	jlHeading.setBounds(70, 10, 300, 20);
	oknoMiObwódKoło.add(jlHeading);	
	
	jtfValue = new JTextField();
	jtfValue.setBounds(150, 60, 100, 40);
	oknoMiObwódKoło.add(jtfValue);
	
	
	jbCalculate = new JButton("Oblicz !");
	jbCalculate.setBounds(50, 150, 300, 40);
	oknoMiObwódKoło.add(jbCalculate);
	jbCalculate.addActionListener(this);
	
	jlResult = new JLabel("Wynik");
	jlResult.setBounds(180, 210, 100, 20);
	oknoMiObwódKoło.add(jlResult);
	
	jtfResult = new JTextField();
	jtfResult.setBounds(150, 260, 100, 40);
	oknoMiObwódKoło.add(jtfResult);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object z = e.getSource();
		if (z == jbCalculate)
		{
			double a = Double.parseDouble(jtfValue.getText());
			
			CalculationCircuitCircle rezultat = new CalculationCircuitCircle(a);
			String wynik = rezultat.rozwiązanieObwódKoło();
			jtfResult.setText(wynik);
			
			
			
			
		}
		
		
		
	}



	

}
