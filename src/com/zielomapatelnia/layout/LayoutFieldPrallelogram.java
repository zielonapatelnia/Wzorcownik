package com.zielomapatelnia.layout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.zielonapatelnia.math.CalculationFieldParallelogram;

public class LayoutFieldPrallelogram implements ActionListener {
	
	JLabel jlHeading, jlResult;
	JButton jbCalculate;
	JTextField jtfResult, jtfValue1, jtfValue2;
	
	public LayoutFieldPrallelogram()
	{
		
		JFrame windowMiFieldPrallelogram = new JFrame();
		windowMiFieldPrallelogram.setLayout(null);
		windowMiFieldPrallelogram.setSize(400, 400);
		windowMiFieldPrallelogram.setTitle("Obliczanie pola równoległoboku");
		windowMiFieldPrallelogram.setDefaultCloseOperation(1);
		windowMiFieldPrallelogram.setVisible(true);	
		
		jlHeading = new JLabel("Aby obliczyć pole równole©łoboku podaj długość boku a oraz wysokość");
		jlHeading.setBounds(20, 10, 400, 20);
		windowMiFieldPrallelogram.add(jlHeading);	
		
		jtfValue1 = new JTextField();
		jtfValue1.setBounds(50, 60, 70, 40);
		windowMiFieldPrallelogram.add(jtfValue1);
		
		jtfValue2 = new JTextField();
		jtfValue2.setBounds(150, 60, 70, 40);
		windowMiFieldPrallelogram.add(jtfValue2);
		
		jbCalculate = new JButton("Oblicz !");
		jbCalculate.setBounds(50, 150, 300, 40);
		windowMiFieldPrallelogram.add(jbCalculate);
		jbCalculate.addActionListener(this);
		
		jlResult = new JLabel("Wynik");
		jlResult.setBounds(180, 210, 100, 20);
		windowMiFieldPrallelogram.add(jlResult);
		
		jtfResult = new JTextField();
		jtfResult.setBounds(150, 260, 100, 40);
		windowMiFieldPrallelogram.add(jtfResult);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e)
	{

		Object z = e.getSource();
		
		if (z == jbCalculate)
		{
			double a = Double.parseDouble(jtfValue1.getText());
			double b = Double.parseDouble(jtfValue2.getText());
			
			CalculationFieldParallelogram obiekt = new CalculationFieldParallelogram(a,b);
			String rozwiązanie = obiekt.rozwiązaniePoleRównoległobok();
			jtfResult.setText(rozwiązanie);
			
		}
	}
}
