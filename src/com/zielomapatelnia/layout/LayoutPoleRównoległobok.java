package com.zielomapatelnia.layout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LayoutPoleRównoległobok {
	
	public LayoutPoleRównoległobok()
	{
		JLabel jlNagłówek, jlWynik;
		JButton jbOblicz;
		JTextField jtfWynik, jtfWartość1, jtfWartość2;
		
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
		
		jlWynik = new JLabel("Wynik");
		jlWynik.setBounds(180, 210, 100, 20);
		oknoMiPoleRównoległobok.add(jlWynik);
		
		jtfWynik = new JTextField();
		jtfWynik.setBounds(150, 260, 100, 40);
		oknoMiPoleRównoległobok.add(jtfWynik);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
