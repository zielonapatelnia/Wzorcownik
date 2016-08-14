package com.zielomapatelnia.layout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.zielonapatelnia.math.CalculationFieldCircle;

public class LayoutFieldCircle  extends JFrame implements ActionListener{

	private JLabel jlHeading, jlResult;
	private JButton jbCalculate;
	private	JTextField jtfResult, jtfValue1;
	
	public LayoutFieldCircle()
	{
		
		JFrame windowsMiFieldCircle = new JFrame();
		windowsMiFieldCircle.setLayout(null);
		windowsMiFieldCircle.setSize(400, 400);
		windowsMiFieldCircle.setTitle("Obliczanie pola koła");
		windowsMiFieldCircle.setDefaultCloseOperation(1);
		windowsMiFieldCircle.setVisible(true);
		
		jlHeading = new JLabel("Aby obliczyć pole koła podaj promień w cm");
		jlHeading.setBounds(70, 10, 300, 20);
		windowsMiFieldCircle.add(jlHeading);	
		
		jtfValue1 = new JTextField();
		jtfValue1.setBounds(150, 60, 100, 40);
		windowsMiFieldCircle.add(jtfValue1);
		
		jbCalculate = new JButton("Oblicz !");
		jbCalculate.setBounds(50, 150, 300, 40);
		windowsMiFieldCircle.add(jbCalculate);
		jbCalculate.addActionListener(this);
		
		jlResult = new JLabel("Wynik");
		jlResult.setBounds(180, 210, 100, 20);
		windowsMiFieldCircle.add(jlResult);
		
		jtfResult = new JTextField();
		jtfResult.setBounds(150, 260, 100, 40);
		windowsMiFieldCircle.add(jtfResult);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Object z = e.getSource();
		
		if (z == jbCalculate)
		{
			double a = Double.parseDouble(jtfValue1.getText());
			
			
			CalculationFieldCircle result = new CalculationFieldCircle(a);
			String resultFinal = result.answerFieldCircle();
			jtfResult.setText(resultFinal);
		
		}
	}
}
