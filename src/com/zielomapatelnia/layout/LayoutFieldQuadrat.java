package com.zielomapatelnia.layout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.zielonapatelnia.math.CalculationFieldQuadrat;

public class LayoutFieldQuadrat implements ActionListener {
	
	JLabel jlHeading, jlResult;
	JButton jbCalculate;
	JTextField jtfResult, jtfValue1;
	
	public LayoutFieldQuadrat()
	{
		
		JFrame windowMiFieldQuadrat = new JFrame();
		windowMiFieldQuadrat.setLayout(null);
		windowMiFieldQuadrat.setSize(400, 400);
		windowMiFieldQuadrat.setTitle("Obliczanie pola kwadratu");
		windowMiFieldQuadrat.setDefaultCloseOperation(1);
		windowMiFieldQuadrat.setVisible(true);
		
		jlHeading = new JLabel("Aby obliczyć pole kwadratu podaj długość boku w cm");
		jlHeading.setBounds(20, 10, 380, 20);
		windowMiFieldQuadrat.add(jlHeading);	
		
		jtfValue1 = new JTextField();
		jtfValue1.setBounds(150, 60, 100, 40);
		windowMiFieldQuadrat.add(jtfValue1);
		
		jbCalculate = new JButton("Oblicz !");
		jbCalculate.setBounds(50, 150, 300, 40);
		windowMiFieldQuadrat.add(jbCalculate);
		jbCalculate.addActionListener(this);
		
		jlResult = new JLabel("Wynik");
		jlResult.setBounds(180, 210, 100, 20);
		windowMiFieldQuadrat.add(jlResult);
		
		jtfResult = new JTextField();
		jtfResult.setBounds(150, 260, 100, 40);
		windowMiFieldQuadrat.add(jtfResult);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
			Object z = e.getSource();
			
			if (z == jbCalculate)
			{
				double a = Double.parseDouble(jtfValue1.getText());
				
				CalculationFieldQuadrat result = new CalculationFieldQuadrat(a);
				String resultFinal = result.answerFieldQuadrat();
				jtfResult.setText(resultFinal);
				
			}
	}
}
