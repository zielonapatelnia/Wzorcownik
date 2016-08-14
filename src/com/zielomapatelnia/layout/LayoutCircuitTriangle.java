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
	
	JLabel jlHeading, jlResult;
	JButton jbCalculate;
	JTextField jtfResult, jtfValue1, jtfValue2, jtfValue3;
	
	public LayoutCircuitTriangle()
	{

		JFrame windowMiCircuitTriangle = new JFrame();
		windowMiCircuitTriangle.setLayout(null);
		windowMiCircuitTriangle.setSize(400, 400);
		windowMiCircuitTriangle.setTitle("Obliczanie obwodu trójkąta");
		windowMiCircuitTriangle.setDefaultCloseOperation(1);
		windowMiCircuitTriangle.setVisible(true);	
		
		jlHeading = new JLabel("Aby obliczyć obwód trójkąta podaj długość boku a,b i c w cm");
		jlHeading.setBounds(20, 10, 400, 20);
		windowMiCircuitTriangle.add(jlHeading);	
		
		jtfValue1 = new JTextField();
		jtfValue1.setBounds(50, 60, 70, 40);
		windowMiCircuitTriangle.add(jtfValue1);
		
		jtfValue2 = new JTextField();
		jtfValue2.setBounds(150, 60, 70, 40);
		windowMiCircuitTriangle.add(jtfValue2);
		
		jtfValue3 = new JTextField();
		jtfValue3.setBounds(250, 60, 70, 40);
		windowMiCircuitTriangle.add(jtfValue3);
		
		jbCalculate = new JButton("Oblicz !");
		jbCalculate.setBounds(50, 150, 300, 40);
		windowMiCircuitTriangle.add(jbCalculate);
		jbCalculate.addActionListener(this);
		
		jlResult = new JLabel("Wynik");
		jlResult.setBounds(180, 210, 100, 20);
		windowMiCircuitTriangle.add(jlResult);
		
		jtfResult = new JTextField();
		jtfResult.setBounds(150, 260, 100, 40);
		windowMiCircuitTriangle.add(jtfResult);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
			Object z = e.getSource();
			
			if (z == jbCalculate)
			{
				double a = Double.parseDouble(jtfValue1.getText());
				double b = Double.parseDouble(jtfValue2.getText());
				double c = Double.parseDouble(jtfValue3.getText());
				
				CalculationCircuitTriangle obiekt = new CalculationCircuitTriangle(a,b,c);
				String rozwiązanie = obiekt.obliczanieObwódTrójkąt();
				jtfResult.setText(rozwiązanie);
			}
	}
}
