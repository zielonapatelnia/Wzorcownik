package com.zielomapatelnia.layout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.zielonapatelnia.math.CalculationCircuitParallelogram;

public class LayoutCircuitParallelogram implements ActionListener {
	
	JLabel jlNagłówek, jlWynik;
	JButton jbOblicz;
	JTextField jtfWynik, jtfWartość1, jtfWartość2;
	
	public LayoutCircuitParallelogram()
	{
		
	
		
		JFrame oknoMiObwódRównoległobok = new JFrame();
		oknoMiObwódRównoległobok.setLayout(null);
		oknoMiObwódRównoległobok.setSize(400, 400);
		oknoMiObwódRównoległobok.setTitle("Obliczanie obwodu równoległoboku");
		oknoMiObwódRównoległobok.setDefaultCloseOperation(1);
		oknoMiObwódRównoległobok.setVisible(true);	
		
		
		jlNagłówek = new JLabel("Aby obliczyć obwód równole©równoległoboku podaj długość boku a oraz b");
		jlNagłówek.setBounds(20, 10, 400, 20);
		oknoMiObwódRównoległobok.add(jlNagłówek);	
		
		jtfWartość1 = new JTextField();
		jtfWartość1.setBounds(50, 60, 70, 40);
		oknoMiObwódRównoległobok.add(jtfWartość1);
		
		jtfWartość2 = new JTextField();
		jtfWartość2.setBounds(150, 60, 70, 40);
		oknoMiObwódRównoległobok.add(jtfWartość2);
		
	
		
		jbOblicz = new JButton("Oblicz !");
		jbOblicz.setBounds(50, 150, 300, 40);
		oknoMiObwódRównoległobok.add(jbOblicz);
		jbOblicz.addActionListener(this);
		
		jlWynik = new JLabel("Wynik");
		jlWynik.setBounds(180, 210, 100, 20);
		oknoMiObwódRównoległobok.add(jlWynik);
		
		jtfWynik = new JTextField();
		jtfWynik.setBounds(150, 260, 100, 40);
		oknoMiObwódRównoległobok.add(jtfWynik);
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e)
	{
		Object z = e.getSource();
		
		if (z == jbOblicz)
		{
			double a = Double.parseDouble(jtfWartość1.getText());
			double b = Double.parseDouble(jtfWartość2.getText());
			
			CalculationCircuitParallelogram obiekt = new CalculationCircuitParallelogram(a,b);
			String rozwiązanie = obiekt.rozwiązanieObwódRównoległoboku();
			jtfWynik.setText(rozwiązanie);
			
			
			
		}
		
	}





}
