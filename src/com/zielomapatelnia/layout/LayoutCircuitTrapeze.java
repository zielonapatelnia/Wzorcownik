package com.zielomapatelnia.layout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.zielonapatelnia.math.CalculationCircuitTrapeze;

public class LayoutCircuitTrapeze implements ActionListener {

	JLabel jlHeading, jlResult;
	JButton jbCalculate;
	JTextField jtfResult, jtfValue1,jtfValue2, jtfValue3, jtfValue4;
	
	public LayoutCircuitTrapeze ()
	{
		
		JFrame windowMiCircuitTrapeze = new JFrame();
		windowMiCircuitTrapeze.setLayout(null);
		windowMiCircuitTrapeze.setSize(450, 400);
		windowMiCircuitTrapeze.setTitle("Obliczanie obwodu trapeza");
		windowMiCircuitTrapeze.setDefaultCloseOperation(1);
		windowMiCircuitTrapeze.setVisible(true);	
		
		jlHeading = new JLabel("Aby obliczyć obwód trapezu podaj długość boku a,b,c,d");
		jlHeading.setBounds(20, 10, 400, 20);
		windowMiCircuitTrapeze.add(jlHeading);	
		
		jtfValue1 = new JTextField();
		jtfValue1.setBounds(50, 60, 70, 40);
		windowMiCircuitTrapeze.add(jtfValue1);
		
		jtfValue2 = new JTextField();
		jtfValue2.setBounds(150, 60, 70, 40);
		windowMiCircuitTrapeze.add(jtfValue2);
		
		jtfValue3 = new JTextField();
		jtfValue3.setBounds(250, 60, 70, 40);
		windowMiCircuitTrapeze.add(jtfValue3);
		
		jtfValue4 = new JTextField();
		jtfValue4.setBounds(350, 60, 70, 40);
		windowMiCircuitTrapeze.add(jtfValue4);
		
		jbCalculate = new JButton("Oblicz !");
		jbCalculate.setBounds(50, 150, 300, 40);
		windowMiCircuitTrapeze.add(jbCalculate);
		jbCalculate.addActionListener(this);
		
		jlResult = new JLabel("Wynik");
		jlResult.setBounds(180, 210, 100, 20);
		windowMiCircuitTrapeze.add(jlResult);
		
		jtfResult = new JTextField();
		jtfResult.setBounds(150, 260, 100, 40);
		windowMiCircuitTrapeze.add(jtfResult);
		
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
			double d = Double.parseDouble(jtfValue4.getText());
			
			CalculationCircuitTrapeze result = new CalculationCircuitTrapeze(a,b,c,d);
			String resultFinal = result.rozwiązanieObwódTrapez();
			jtfResult.setText(resultFinal);
			
		}
	}
}
