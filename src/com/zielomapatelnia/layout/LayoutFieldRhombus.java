package com.zielomapatelnia.layout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.zielonapatelnia.math.CalculationFieldRhombus;

public class LayoutFieldRhombus  implements ActionListener{

	JLabel jlHeading, jlResult;
	JButton jbCalculate;
	JTextField jtfResult, jtfValue1, jtfValue2;
	
	public LayoutFieldRhombus()
	{
		
		JFrame windowMiFieldRhombus = new JFrame();
		windowMiFieldRhombus.setLayout(null);
		windowMiFieldRhombus.setSize(400, 400);
		windowMiFieldRhombus.setTitle("Obliczanie pola Rombu");
		windowMiFieldRhombus.setDefaultCloseOperation(1);
		windowMiFieldRhombus.setVisible(true);	
		
		jlHeading = new JLabel("Aby obliczyć pole rombu podaj długość boku a oraz wysokość");
		jlHeading.setBounds(20, 10, 400, 20);
		windowMiFieldRhombus.add(jlHeading);	
		
		jtfValue1 = new JTextField();
		jtfValue1.setBounds(50, 60, 70, 40);
		windowMiFieldRhombus.add(jtfValue1);
		
		jtfValue2 = new JTextField();
		jtfValue2.setBounds(150, 60, 70, 40);
		windowMiFieldRhombus.add(jtfValue2);
		
		jbCalculate = new JButton("Oblicz !");
		jbCalculate.setBounds(50, 150, 300, 40);
		windowMiFieldRhombus.add(jbCalculate);
		jbCalculate.addActionListener(this);
		
		jlResult = new JLabel("Wynik");
		jlResult.setBounds(180, 210, 100, 20);
		windowMiFieldRhombus.add(jlResult);
		
		jtfResult = new JTextField();
		jtfResult.setBounds(150, 260, 100, 40);
		windowMiFieldRhombus.add(jtfResult);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		Object z = e.getSource();
		
		if (z == jbCalculate)
		{
			double a = Double.parseDouble(jtfValue1.getText());
			double b = Double.parseDouble(jtfValue2.getText());
			
			CalculationFieldRhombus result = new CalculationFieldRhombus(a,b);
			String resultFinal = result.rozwiązaniePoleRomb();
			jtfResult.setText(resultFinal);
			
			
		}
	}
}
