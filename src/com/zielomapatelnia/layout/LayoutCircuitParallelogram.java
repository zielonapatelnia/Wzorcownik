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
		JFrame windowMiCircuitParallelogram = new JFrame();
		windowMiCircuitParallelogram.setLayout(null);
		windowMiCircuitParallelogram.setSize(400, 400);
		windowMiCircuitParallelogram.setTitle("Obliczanie obwodu równoległoboku");
		windowMiCircuitParallelogram.setDefaultCloseOperation(1);
		windowMiCircuitParallelogram.setVisible(true);	
		
		jlHeading = new JLabel("Aby obliczyć obwód równole©równoległoboku podaj długość boku a oraz b");
		jlHeading.setBounds(20, 10, 400, 20);
		windowMiCircuitParallelogram.add(jlHeading);	
		
		jtfValue1 = new JTextField();
		jtfValue1.setBounds(50, 60, 70, 40);
		windowMiCircuitParallelogram.add(jtfValue1);
		
		jtfValue2 = new JTextField();
		jtfValue2.setBounds(150, 60, 70, 40);
		windowMiCircuitParallelogram.add(jtfValue2);
		
		jbCalculate = new JButton("Oblicz !");
		jbCalculate.setBounds(50, 150, 300, 40);
		windowMiCircuitParallelogram.add(jbCalculate);
		jbCalculate.addActionListener(this);
		
		jlResult = new JLabel("Wynik");
		jlResult.setBounds(180, 210, 100, 20);
		windowMiCircuitParallelogram.add(jlResult);
		
		jtfResult = new JTextField();
		jtfResult.setBounds(150, 260, 100, 40);
		windowMiCircuitParallelogram.add(jtfResult);
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
