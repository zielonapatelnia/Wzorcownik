package com.zielomapatelnia.layout;
import com.zielonapatelnia.math.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.zielonapatelnia.math.CalculationFieldTriangle;

public class LayoutFieldTriangle implements ActionListener{
	
	JLabel jlHeading, jlResult;
	JButton jbCalculate;
	JTextField jtfResult, jtfValue1;
	
	public LayoutFieldTriangle()
	{
		
		
		JFrame windowMiFieldTriangle = new JFrame();
		windowMiFieldTriangle.setLayout(null);
		windowMiFieldTriangle.setSize(400, 400);
		windowMiFieldTriangle.setTitle("Obliczanie pola trójkąta równobocznego");
		windowMiFieldTriangle.setDefaultCloseOperation(1);
		windowMiFieldTriangle.setVisible(true);	
		
		jlHeading = new JLabel("Aby obliczyć obwód trójkąta podaj długość boku a w cm");
		jlHeading.setBounds(20, 10, 380, 20);
		windowMiFieldTriangle.add(jlHeading);	
		
		jtfValue1 = new JTextField();
		jtfValue1.setBounds(125, 60, 70, 40);
		windowMiFieldTriangle.add(jtfValue1);
		
		jbCalculate = new JButton("Oblicz !");
		jbCalculate.setBounds(50, 150, 300, 40);
		windowMiFieldTriangle.add(jbCalculate);
		jbCalculate.addActionListener(this);
		
		jlResult = new JLabel("Wynik");
		jlResult.setBounds(180, 210, 100, 20);
		windowMiFieldTriangle.add(jlResult);
		
		jtfResult = new JTextField();
		jtfResult.setBounds(150, 260, 100, 40);
		windowMiFieldTriangle.add(jtfResult);
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Object z = e.getSource();
		
		if (z == jbCalculate)
		{
			double b = Double.parseDouble(jtfValue1.getText());
			
			CalculationFieldTriangle obiekt = new CalculationFieldTriangle(b);
			String rozwiązanie = obiekt.rozwiązaniePoleTrójkąt();
			jtfResult.setText(rozwiązanie);
			
		}
	}
}
