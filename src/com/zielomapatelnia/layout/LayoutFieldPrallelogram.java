package com.zielomapatelnia.layout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.zielonapatelnia.math.CalculationFieldParallelogram;

public class LayoutFieldPrallelogram implements ActionListener {
	
	
	JLabel jlNagłówek, jlWynik;
	JButton jbOblicz;
	JTextField jtfWynik, jtfWartość1, jtfWartość2;
	
	public LayoutFieldPrallelogram()
	{
	
		
		JFrame oknoMiPoleRównoległobok = new JFrame();
		oknoMiPoleRównoległobok.setLayout(null);
		oknoMiPoleRównoległobok.setSize(400, 400);
		oknoMiPoleRównoległobok.setTitle("Obliczanie pola równoległoboku");
		oknoMiPoleRównoległobok.setDefaultCloseOperation(1);
		oknoMiPoleRównoległobok.setVisible(true);	
		
		jlNagłówek = new JLabel("Aby obliczyć pole równole©łoboku podaj długość boku a oraz wysokość");
		jlNagłówek.setBounds(20, 10, 400, 20);
		oknoMiPoleRównoległobok.add(jlNagłówek);	
		
		jtfWartość1 = new JTextField();
		jtfWartość1.setBounds(50, 60, 70, 40);
		oknoMiPoleRównoległobok.add(jtfWartość1);
		
		jtfWartość2 = new JTextField();
		jtfWartość2.setBounds(150, 60, 70, 40);
		oknoMiPoleRównoległobok.add(jtfWartość2);
		
	
		
		jbOblicz = new JButton("Oblicz !");
		jbOblicz.setBounds(50, 150, 300, 40);
		oknoMiPoleRównoległobok.add(jbOblicz);
		jbOblicz.addActionListener(this);
		
		jlWynik = new JLabel("Wynik");
		jlWynik.setBounds(180, 210, 100, 20);
		oknoMiPoleRównoległobok.add(jlWynik);
		
		jtfWynik = new JTextField();
		jtfWynik.setBounds(150, 260, 100, 40);
		oknoMiPoleRównoległobok.add(jtfWynik);
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e)
	{

		Object z = e.getSource();
		
		if (z == jbOblicz)
		{
			double a = Double.parseDouble(jtfWartość1.getText());
			double b = Double.parseDouble(jtfWartość2.getText());
			
			CalculationFieldParallelogram obiekt = new CalculationFieldParallelogram(a,b);
			String rozwiązanie = obiekt.rozwiązaniePoleRównoległobok();
			jtfWynik.setText(rozwiązanie);
			
			
			
		}
		
		
	}



}
