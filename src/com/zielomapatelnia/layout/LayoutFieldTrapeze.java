package com.zielomapatelnia.layout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.zielonapatelnia.math.CalculationFieldTrapeze;

public class LayoutFieldTrapeze implements ActionListener
{

	JLabel jlHeading, jlResult;
	JButton jbCalculate;
	JTextField jtfResult, jtfValue1,jtfValue2, jtfValue3;
	
	public LayoutFieldTrapeze()
	{
	
		JFrame windowMiFieldTrapeze = new JFrame();
		windowMiFieldTrapeze.setLayout(null);
		windowMiFieldTrapeze.setSize(400, 400);
		windowMiFieldTrapeze.setTitle("Obliczanie pola trapeza");
		windowMiFieldTrapeze.setDefaultCloseOperation(1);
		windowMiFieldTrapeze.setVisible(true);	
		
		jlHeading = new JLabel("Aby obliczyć pole trapezu podaj długość boku a,b,c");
		jlHeading.setBounds(20, 10, 400, 20);
		windowMiFieldTrapeze.add(jlHeading);	
		
		jtfValue1 = new JTextField();
		jtfValue1.setBounds(50, 60, 70, 40);
		windowMiFieldTrapeze.add(jtfValue1);
		
		jtfValue2 = new JTextField();
		jtfValue2.setBounds(150, 60, 70, 40);
		windowMiFieldTrapeze.add(jtfValue2);
		
		jtfValue3 = new JTextField();
		jtfValue3.setBounds(250, 60, 70, 40);
		windowMiFieldTrapeze.add(jtfValue3);
		
		jbCalculate = new JButton("Oblicz !");
		jbCalculate.setBounds(50, 150, 300, 40);
		windowMiFieldTrapeze.add(jbCalculate);
		jbCalculate.addActionListener(this);
		
		jlResult = new JLabel("Wynik");
		jlResult.setBounds(180, 210, 100, 20);
		windowMiFieldTrapeze.add(jlResult);
		
		jtfResult = new JTextField();
		jtfResult.setBounds(150, 260, 100, 40);
		windowMiFieldTrapeze.add(jtfResult);
		
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
			
			
			CalculationFieldTrapeze result = new CalculationFieldTrapeze( a, b,c);
			String finalResult = result.rozwiązaniePoleTrapez();
			jtfResult.setText(finalResult);
			
		}
	}
}


