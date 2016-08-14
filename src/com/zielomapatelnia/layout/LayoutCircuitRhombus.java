package com.zielomapatelnia.layout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.zielonapatelnia.math.CalculationCircuitRhombus;

public class LayoutCircuitRhombus implements ActionListener {
	
	JLabel jlHeading, jlResult;
	JButton jbCalculate;
	JTextField jtfResult, jtfValue1;
	
	public LayoutCircuitRhombus()
	{
		
		JFrame windowMiCircuitRhombus = new JFrame();
		windowMiCircuitRhombus.setLayout(null);
		windowMiCircuitRhombus.setSize(400, 400);
		windowMiCircuitRhombus.setTitle("Obliczanie obwodu Rombu");
		windowMiCircuitRhombus.setDefaultCloseOperation(1);
		windowMiCircuitRhombus.setVisible(true);
		
		jlHeading = new JLabel("Aby obliczyć pole rombu podaj długość boku a");
		jlHeading.setBounds(20, 10, 400, 20);
		windowMiCircuitRhombus.add(jlHeading);	
		
		jtfValue1 = new JTextField();
		jtfValue1.setBounds(50, 60, 70, 40);
		windowMiCircuitRhombus.add(jtfValue1);
		
		jbCalculate = new JButton("Oblicz !");
		jbCalculate.setBounds(50, 150, 300, 40);
		windowMiCircuitRhombus.add(jbCalculate);
		jbCalculate.addActionListener(this);
		
		jlResult = new JLabel("Wynik");
		jlResult.setBounds(180, 210, 100, 20);
		windowMiCircuitRhombus.add(jlResult);
		
		jtfResult = new JTextField();
		jtfResult.setBounds(150, 260, 100, 40);
		windowMiCircuitRhombus.add(jtfResult);
		
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
			Object z = e.getSource();
			
			if (z == jbCalculate)
			{
				double a = Double.parseDouble(jtfValue1.getText());
				
				CalculationCircuitRhombus result = new CalculationCircuitRhombus(a);
				String resultFinal = result.answerCircuitRhombus();
				jtfResult.setText(resultFinal);
				
				
			}
	}
}
