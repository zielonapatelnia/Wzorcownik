package com.zielomapatelnia.layout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.zielonapatelnia.math.CalculationCircuitParallelogram;

public class LayoutCircuitParallelogram implements ActionListener 
{
	JLabel jlHeading, jlResult;
	JButton jbCalculate;
	JTextField jtfResult, jtfValue1, jtfValue2;
	
	public LayoutCircuitParallelogram()
	{
		JFrame windowsMiCircuitParallelogram = new JFrame();
		windowsMiCircuitParallelogram.setLayout(null);
		windowsMiCircuitParallelogram.setSize(400, 400);
		windowsMiCircuitParallelogram.setTitle("Obliczanie obwodu równoległoboku");
		windowsMiCircuitParallelogram.setDefaultCloseOperation(1);
		windowsMiCircuitParallelogram.setVisible(true);	
		
		jlHeading = new JLabel("Aby obliczyć obwód równole©równoległoboku podaj długość boku a oraz b");
		jlHeading.setBounds(20, 10, 400, 20);
		windowsMiCircuitParallelogram.add(jlHeading);	
		
		jtfValue1 = new JTextField();
		jtfValue1.setBounds(50, 60, 70, 40);
		windowsMiCircuitParallelogram.add(jtfValue1);
		
		jtfValue2 = new JTextField();
		jtfValue2.setBounds(150, 60, 70, 40);
		windowsMiCircuitParallelogram.add(jtfValue2);
		
		jbCalculate = new JButton("Oblicz !");
		jbCalculate.setBounds(50, 150, 300, 40);
		windowsMiCircuitParallelogram.add(jbCalculate);
		jbCalculate.addActionListener(this);
		
		jlResult = new JLabel("Wynik");
		jlResult.setBounds(180, 210, 100, 20);
		windowsMiCircuitParallelogram.add(jlResult);
		
		jtfResult = new JTextField();
		jtfResult.setBounds(150, 260, 100, 40);
		windowsMiCircuitParallelogram.add(jtfResult);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		Object z = e.getSource();
		
		if (z == jbCalculate)
		{
			double a = Double.parseDouble(jtfValue1.getText());
			double b = Double.parseDouble(jtfValue2.getText());
			
			CalculationCircuitParallelogram result = new CalculationCircuitParallelogram(a,b);
			String resultFinal = result.rozwiązanieObwódRównoległoboku();
			jtfResult.setText(resultFinal);
			
			
			
		}
	}
}
