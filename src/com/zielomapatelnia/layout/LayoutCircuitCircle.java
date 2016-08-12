package com.zielomapatelnia.layout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.zielonapatelnia.math.CalculationCircuitCircle;

public class LayoutCircuitCircle implements ActionListener 
{
	JLabel jlHeading, jlResult;
	JButton jbCalculate;
	JTextField jtfResult, jtfValue;
	
	public LayoutCircuitCircle()
	{
	JFrame windowMiCircuitCircle = new JFrame();
	windowMiCircuitCircle.setLayout(null);
	windowMiCircuitCircle.setSize(400, 400);
	windowMiCircuitCircle.setTitle("Obliczanie obwodu koła");
	windowMiCircuitCircle.setDefaultCloseOperation(1);
	windowMiCircuitCircle.setVisible(true);
	
	jlHeading = new JLabel("Aby obliczyć obwód koła podaj średnicę koła w cm");
	jlHeading.setBounds(70, 10, 300, 20);
	windowMiCircuitCircle.add(jlHeading);	
	
	jtfValue = new JTextField();
	jtfValue.setBounds(150, 60, 100, 40);
	windowMiCircuitCircle.add(jtfValue);
	
	jbCalculate = new JButton("Oblicz !");
	jbCalculate.setBounds(50, 150, 300, 40);
	windowMiCircuitCircle.add(jbCalculate);
	jbCalculate.addActionListener(this);
	
	jlResult = new JLabel("Wynik");
	jlResult.setBounds(180, 210, 100, 20);
	windowMiCircuitCircle.add(jlResult);
	
	jtfResult = new JTextField();
	jtfResult.setBounds(150, 260, 100, 40);
	windowMiCircuitCircle.add(jtfResult);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		Object z = e.getSource();
		if (z == jbCalculate)
		{
			double a = Double.parseDouble(jtfValue.getText());
			
			CalculationCircuitCircle result = new CalculationCircuitCircle(a);
			String resultFinal = result.rozwiązanieObwódKoło();
			jtfResult.setText(resultFinal);
			
		}
	}
}
