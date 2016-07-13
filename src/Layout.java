import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Layout extends JFrame implements ActionListener {

 private	JMenuBar menuBar;
	private JMenu mPlik , mFiguryPłaskie, mPomoc; 
	private JMenu mKoło, mKwadrat, mProstokąt, mTrójkąt, mRównoległobok, mRomb, mTrapez ;
	private JMenuItem miOProjekcie, miWyjście, miPoleKoło, miObwódKoło, miPoleKwadrat, miObwódKwadrat, miPoleProstokąt, miObwódProstokąt, miPoleTrójkąt, miObwódTrójkąt, miPoleRównoległobok, miObwódRównoległobok,miPoleRomb,miObwódRomb,miPoleTrapez,miObwódTrapez;
	
	
	
	
	public Layout ()
	{
		setSize(810,450);
		setTitle("Wzorownik v 0.1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mPlik = new JMenu("Plik");
		menuBar.add(mPlik);
		mFiguryPłaskie = new JMenu("Figury Płaskie");
		menuBar.add(mFiguryPłaskie);
		mPomoc = new JMenu("Pomoc");
		menuBar.add(mPomoc);
		
		
		
		miWyjście = new JMenuItem("Wyjscie");
		mPlik.addSeparator();
		mPlik.add(miWyjście);
		
		miOProjekcie = new JMenuItem("O Projekcie");
		mPomoc.add(miOProjekcie);
		miOProjekcie.addActionListener(this);
		
		mKoło = new JMenu("Koło");
		mFiguryPłaskie.add(mKoło);
		mKwadrat = new JMenu("Kwadrat");
		mFiguryPłaskie.add(mKwadrat);
		mProstokąt = new JMenu("Prostokąt");
		mFiguryPłaskie.add(mProstokąt);
		mTrójkąt = new JMenu("Trójkąt");
		mFiguryPłaskie.add(mTrójkąt);
		mRównoległobok = new JMenu("Równoległobok");
		mFiguryPłaskie.add(mRównoległobok);
		mRomb = new JMenu("Romb");
		mFiguryPłaskie.add(mRomb);
		mTrapez = new JMenu("Trapez");
		mFiguryPłaskie.add(mTrapez);
		
		miPoleKoło = new JMenuItem("Oblicz pola koła");
		mKoło.add(miPoleKoło);
		miObwódKoło = new JMenuItem("Oblicz obwodu koła");
		mKoło.add(miObwódKoło);
		miPoleKwadrat = new JMenuItem("Oblicz pole kwadratu");
		mKwadrat.add(miPoleKwadrat);
		miObwódKwadrat = new JMenuItem("Oblicz obwód kwadratu");
		mKwadrat.add(miObwódKwadrat);
		miPoleProstokąt = new JMenuItem("Oblicz pole prostokąta");
		mProstokąt.add(miPoleProstokąt);
		miObwódProstokąt = new JMenuItem("Oblicz obwód prostokąta");
		mProstokąt.add(miObwódProstokąt);
		miPoleTrójkąt = new JMenuItem("Oblicz pole trójkąta");
		mTrójkąt.add(miPoleTrójkąt);
		miObwódTrójkąt = new JMenuItem("Oblicz obwód trójkąta");
		mTrójkąt.add(miObwódTrójkąt);
		miPoleRównoległobok = new JMenuItem("Oblicz pole równoległoboku");
		mRównoległobok.add(miPoleRównoległobok);
		miObwódRównoległobok = new JMenuItem("Oblicz obwód równoległoboku");
		mRównoległobok.add(miObwódRównoległobok);
		miPoleRomb = new JMenuItem("Oblicz pole rombu");
		mRomb.add(miPoleRomb);
		miObwódRomb = new JMenuItem("Oblicz obwód rombu");
		mRomb.add(miObwódRomb);
		miPoleTrapez = new JMenuItem("Oblicz pole trapezu");
		mTrapez.add(miPoleTrapez);
		miObwódTrapez = new JMenuItem("Oblicz obwód trapezu");
		mTrapez.add(miObwódTrapez);
		
		
		
		miPoleKoło.addActionListener(this);
		miObwódKoło.addActionListener(this);
		miPoleKwadrat.addActionListener(this);
		miObwódKwadrat.addActionListener(this);
		miPoleProstokąt.addActionListener(this);
		miObwódProstokąt.addActionListener(this);
		miPoleTrójkąt.addActionListener(this);
		miObwódTrójkąt.addActionListener(this);
		miPoleRównoległobok.addActionListener(this);
		miObwódRównoległobok.addActionListener(this);
		miPoleRomb.addActionListener(this);
		miObwódRomb.addActionListener(this);
		miPoleTrapez.addActionListener(this);
		miObwódTrapez.addActionListener(this);
		miWyjście.addActionListener(this);
	}
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object z = e.getSource();
		
		

		if ( z == miOProjekcie)
		{
			JOptionPane.showMessageDialog(this, "                                           Cześć \n Mam na imię Krzysiek, jest to mój pierwszy projekt w Javie z użyciem GUI \n                                  Pozdrawiam","O Projekcie", JOptionPane.INFORMATION_MESSAGE);
		}
		else if (z == miPoleKoło)
		{
		LayoutPoleKoło obiekt = new LayoutPoleKoło();
		
		}
		else if (z == miObwódKoło)
		{
		LayoutObwódKoło obiekt = new LayoutObwódKoło();
		
		} 
		else if (z == miPoleKwadrat)
		{
			LayoutPoleKwadrat obiekt = new LayoutPoleKwadrat();
			
			
			
		} 
		else if (z == miObwódKwadrat)
		{
			LayoutObwódKwadrat obiekt = new LayoutObwódKwadrat();
			
			
		}
		else if (z == miPoleProstokąt)
		{
			LayoutPoleProstokąt obiekt = new LayoutPoleProstokąt();
			
			
		}
		else if (z == miObwódProstokąt)
		{
			
			
			LayoutObwódProstokąt obiekt = new LayoutObwódProstokąt();
			
		}
		else if (z == miPoleTrójkąt)
		{
			LayoutPoleTrójkąt obiekt = new LayoutPoleTrójkąt();
		}
		else if (z == miObwódTrójkąt)
		{
			LayoutObwódTrójkąt obiekt = new LayoutObwódTrójkąt();
			
		}
		else if (z == miPoleRównoległobok)
		{
			LayoutPoleRównoległobok obiekt = new LayoutPoleRównoległobok();
			
		}
		else if (z == miObwódRównoległobok)
		{
			LayoutObwódRównoległobok obiekt = new LayoutObwódRównoległobok();	
			
		
		}
		else if (z == miPoleRomb)
		{
			LayoutPoleRomb obiekt = new LayoutPoleRomb();
			
			
		}
		else if (z == miObwódRomb)
		{
			
			LayoutObwódRomb obiekt = new LayoutObwódRomb();
			
			
		}
		else if (z == miPoleTrapez)
		{
			
			
			LayoutPoleTrapez obiekt = new LayoutPoleTrapez();
			
			
		}
		else if (z == miObwódTrapez)
		{
			LayoutObwódTrapez obiekt = new LayoutObwódTrapez();
			
		}
		
		else if (z == miWyjście)
		{
			dispose();
		}
		
		
		
	}










	public static void main(String[] args) {

		Layout appMenu = new Layout();
		appMenu.setVisible(true);
		
	}

}
