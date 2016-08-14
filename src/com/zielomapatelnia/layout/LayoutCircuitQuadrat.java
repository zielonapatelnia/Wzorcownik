package com.zielomapatelnia.layout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.zielonapatelnia.math.CalculationCircuitQuadrart;

public class LayoutCircuitQuadrat implements ActionListener {
	
	JLabel jlHeading, jlResult;
	JButton jbCalculate;
	JTextField jtfResult, jtfValue1;

	public LayoutCircuitQuadrat()
	{
		JFrame windowMiCircuitQuadrat = new JFrame();
		windowMiCircuitQuadrat.setLayout(null);
		windowMiCircuitQuadrat.setSize(400, 400);
		windowMiCircuitQuadrat.setTitle("Obliczanie obwodu kwadratu");
		windowMiCircuitQuadrat.setDefaultCloseOperation(1);
		windowMiCircuitQuadrat.setVisible(true);
		
		jlHeading = new JLabel("Aby obliczyć obwód kwadratu podaj długość boku w cm");
		jlHeading.setBounds(20, 10, 380, 20);
		windowMiCircuitQuadrat.add(jlHeading);	
		
		jtfValue1 = new JTextField();
		jtfValue1.setBounds(150, 60, 100, 40);
		windowMiCircuitQuadrat.add(jtfValue1);
		
		
		jbCalculate = new JButton("Oblicz !");
		jbCalculate.setBounds(50, 150, 300, 40);
		windowMiCircuitQuadrat.add(jbCalculate);
		jbCalculate.addActionListener(this);
		
		jlResult = new JLabel("Wynik");
		jlResult.setBounds(180, 210, 100, 20);
		windowMiCircuitQuadrat.add(jlResult);
		
		jtfResult = new JTextField();
		jtfResult.setBounds(150, 260, 100, 40);
		windowMiCircuitQuadrat.add(jtfResult);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Object z = e.getSource();
		
		if (z == jbCalculate)
		{
			double a = Double.parseDouble(jtfValue1.getText());
			CalculationCircuitQuadrart result = new CalculationCircuitQuadrart(a);
			String resultFinal = result.rozwiązanieObwódKwadrat();
			jtfResult.setText(resultFinal);
		}
	}
}
