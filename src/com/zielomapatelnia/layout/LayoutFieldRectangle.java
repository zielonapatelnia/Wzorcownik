package com.zielomapatelnia.layout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.zielonapatelnia.math.CalculationFieldRectangle;

public class LayoutFieldRectangle implements ActionListener  {
	
	JLabel jlHeading, jlResult;
	JButton jbCaluclate;
	JTextField jtfResult, jtfValue1, jtfValue2;
	
	
	public LayoutFieldRectangle()
	{
		
		JFrame windowMiFieldRectangle = new JFrame();
		windowMiFieldRectangle.setLayout(null);
		windowMiFieldRectangle.setSize(400, 400);
		windowMiFieldRectangle.setTitle("Obliczanie pola protokąta");
		windowMiFieldRectangle.setDefaultCloseOperation(1);
		windowMiFieldRectangle.setVisible(true);	
		
		jlHeading = new JLabel("Aby obliczyć pole prostokąta podaj długość boku a i b w cm");
		jlHeading.setBounds(20, 10, 380, 20);
		windowMiFieldRectangle.add(jlHeading);	
		
		jtfValue1 = new JTextField();
		jtfValue1.setBounds(125, 60, 70, 40);
		windowMiFieldRectangle.add(jtfValue1);
		
		jtfValue2 = new JTextField();
		jtfValue2.setBounds(225, 60, 70, 40);
		windowMiFieldRectangle.add(jtfValue2);
		
		jbCaluclate = new JButton("Oblicz !");
		jbCaluclate.setBounds(50, 150, 300, 40);
		windowMiFieldRectangle.add(jbCaluclate);
		jbCaluclate.addActionListener(this);
		
		jlResult = new JLabel("Wynik");
		jlResult.setBounds(180, 210, 100, 20);
		windowMiFieldRectangle.add(jlResult);
		
		jtfResult = new JTextField();
		jtfResult.setBounds(150, 260, 100, 40);
		windowMiFieldRectangle.add(jtfResult);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
			Object z = e.getSource();
			
			if (z == jbCaluclate)
			{
				double a = Double.parseDouble(jtfValue1.getText());
				double b = Double.parseDouble(jtfValue2.getText());
				
				CalculationFieldRectangle result = new CalculationFieldRectangle(a,b);
				String resultFinal = result.answerFieldRectangle();
				jtfResult.setText(resultFinal);
			}
	}
}
