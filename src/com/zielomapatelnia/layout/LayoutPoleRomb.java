package com.zielomapatelnia.layout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LayoutPoleRomb {

	public LayoutPoleRomb()
	{
		JLabel jlNagłówek, jlWynik;
		JButton jbOblicz;
		JTextField jtfWynik, jtfWartość1, jtfWartość2;
		
		JFrame oknoMiOPoleRomb = new JFrame();
		oknoMiOPoleRomb.setLayout(null);
		oknoMiOPoleRomb.setSize(400, 400);
		oknoMiOPoleRomb.setTitle("Obliczanie pola Rombu");
		oknoMiOPoleRomb.setDefaultCloseOperation(1);
		oknoMiOPoleRomb.setVisible(true);	
		

		jlNagłówek = new JLabel("Aby obliczyć pole rombu podaj długość boku a oraz wysokość");
		jlNagłówek.setBounds(20, 10, 400, 20);
		oknoMiOPoleRomb.add(jlNagłówek);	
		
		jtfWartość1 = new JTextField();
		jtfWartość1.setBounds(50, 60, 70, 40);
		oknoMiOPoleRomb.add(jtfWartość1);
		
		jtfWartość2 = new JTextField();
		jtfWartość2.setBounds(150, 60, 70, 40);
		oknoMiOPoleRomb.add(jtfWartość2);
		
	
		
		jbOblicz = new JButton("Oblicz !");
		jbOblicz.setBounds(50, 150, 300, 40);
		oknoMiOPoleRomb.add(jbOblicz);
		
		jlWynik = new JLabel("Wynik");
		jlWynik.setBounds(180, 210, 100, 20);
		oknoMiOPoleRomb.add(jlWynik);
		
		jtfWynik = new JTextField();
		jtfWynik.setBounds(150, 260, 100, 40);
		oknoMiOPoleRomb.add(jtfWynik);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
