package com.zielomapatelnia.layout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.zielonapatelnia.math.CalculationCircuitRectangle;

public class LayoutCircuitRectangle implements ActionListener {
	
	JLabel jlHeading, jlResult;
	JButton jbCalculate;
	JTextField jtfResult, jtfValue1, jtfValue2;

	public LayoutCircuitRectangle()
	{
		
		JFrame windowMiCircuitRectangle = new JFrame();
		windowMiCircuitRectangle.setLayout(null);
		windowMiCircuitRectangle.setSize(400, 400);
		windowMiCircuitRectangle.setTitle("Obliczanie obwodu prosotkąta");
		windowMiCircuitRectangle.setDefaultCloseOperation(1);
		windowMiCircuitRectangle.setVisible(true);	
		
		jlHeading = new JLabel("Aby obliczyć obwód prostokąta podaj długość boku a i b w cm");
		jlHeading.setBounds(20, 10, 380, 20);
		windowMiCircuitRectangle.add(jlHeading);	
		
		jtfValue1 = new JTextField();
		jtfValue1.setBounds(125, 60, 70, 40);
		windowMiCircuitRectangle.add(jtfValue1);
		
		jtfValue2 = new JTextField();
		jtfValue2.setBounds(225, 60, 70, 40);
		windowMiCircuitRectangle.add(jtfValue2);
		
		
		jbCalculate = new JButton("Oblicz !");
		jbCalculate.setBounds(50, 150, 300, 40);
		windowMiCircuitRectangle.add(jbCalculate);
		jbCalculate.addActionListener(this);
		
		jlResult = new JLabel("Wynik");
		jlResult.setBounds(180, 210, 100, 20);
		windowMiCircuitRectangle.add(jlResult);
		
		jtfResult = new JTextField();
		jtfResult.setBounds(150, 260, 100, 40);
		windowMiCircuitRectangle.add(jtfResult);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
			Object z = e.getSource();
			
			if (z == jbCalculate)
			{
				Double a = Double.parseDouble(jtfValue1.getText());
				Double b = Double.parseDouble(jtfValue2.getText());
				
				CalculationCircuitRectangle result = new CalculationCircuitRectangle(a,b);
				String resultFinal = result.rozwiązanieObwódPoleKwadrat();
				jtfResult.setText(resultFinal);
				
				
			}
	}
}
