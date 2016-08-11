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

import com.zielomapatelnia.layout.LayoutObwódKoło;
import com.zielomapatelnia.layout.LayoutObwódKwadrat;
import com.zielomapatelnia.layout.LayoutObwódProstokąt;
import com.zielomapatelnia.layout.LayoutObwódRomb;
import com.zielomapatelnia.layout.LayoutObwódRównoległobok;
import com.zielomapatelnia.layout.LayoutObwódTrapez;
import com.zielomapatelnia.layout.LayoutObwódTrójkąt;
import com.zielomapatelnia.layout.LayoutPoleKoło;
import com.zielomapatelnia.layout.LayoutPoleKwadrat;
import com.zielomapatelnia.layout.LayoutPoleProstokąt;
import com.zielomapatelnia.layout.LayoutPoleRomb;
import com.zielomapatelnia.layout.LayoutPoleRównoległobok;
import com.zielomapatelnia.layout.LayoutPoleTrapez;
import com.zielomapatelnia.layout.LayoutPoleTrójkąt;


public class Layout extends JFrame implements ActionListener {

 private	JMenuBar menuBar;
	private JMenu mFile , mFlatFigure, mHelp; 
	private JMenu mCircle, mQuadrat, mRectangle, mTriangle, mParallelogram, mRhombus, mTrapeze ;
	private JMenuItem miAboutProject, miExit, miFieldCircle, miCircuitCircle, miFieldQuadrat, miCircuitQuadreat, miFieldRectangle, miCircuitRectangle, miPoleTrójkąt, miObwódTrójkąt, miPoleRównoległobok, miObwódRównoległobok,miPoleRomb,miObwódRomb,miPoleTrapez,miObwódTrapez;
	
	
	
	
	public Layout ()
	{
		setSize(810,450);
		setTitle("Wzorownik v 0.1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mFile = new JMenu("Plik");
		menuBar.add(mFile);
		mFlatFigure = new JMenu("Figury Płaskie");
		menuBar.add(mFlatFigure);
		mHelp = new JMenu("Pomoc");
		menuBar.add(mHelp);
		
		
		
		miExit = new JMenuItem("Wyjscie");
		mFile.addSeparator();
		mFile.add(miExit);
		
		miAboutProject = new JMenuItem("O Projekcie");
		mHelp.add(miAboutProject);
		miAboutProject.addActionListener(this);
		
		mCircle = new JMenu("Koło");
		mFlatFigure.add(mCircle);
		mQuadrat = new JMenu("Kwadrat");
		mFlatFigure.add(mQuadrat);
		mRectangle = new JMenu("Prostokąt");
		mFlatFigure.add(mRectangle);
		mTriangle = new JMenu("Trójkąt");
		mFlatFigure.add(mTriangle);
		mParallelogram = new JMenu("Równoległobok");
		mFlatFigure.add(mParallelogram);
		mRhombus = new JMenu("Romb");
		mFlatFigure.add(mRhombus);
		mTrapeze = new JMenu("Trapez");
		mFlatFigure.add(mTrapeze);
		
		miFieldCircle = new JMenuItem("Oblicz pola koła");
		mCircle.add(miFieldCircle);
		miCircuitCircle = new JMenuItem("Oblicz obwodu koła");
		mCircle.add(miCircuitCircle);
		miFieldQuadrat = new JMenuItem("Oblicz pole kwadratu");
		mQuadrat.add(miFieldQuadrat);
		miCircuitQuadreat = new JMenuItem("Oblicz obwód kwadratu");
		mQuadrat.add(miCircuitQuadreat);
		miFieldRectangle = new JMenuItem("Oblicz pole prostokąta");
		mRectangle.add(miFieldRectangle);
		miCircuitRectangle = new JMenuItem("Oblicz obwód prostokąta");
		mRectangle.add(miCircuitRectangle);
		miPoleTrójkąt = new JMenuItem("Oblicz pole trójkąta");
		mTriangle.add(miPoleTrójkąt);
		miObwódTrójkąt = new JMenuItem("Oblicz obwód trójkąta");
		mTriangle.add(miObwódTrójkąt);
		miPoleRównoległobok = new JMenuItem("Oblicz pole równoległoboku");
		mParallelogram.add(miPoleRównoległobok);
		miObwódRównoległobok = new JMenuItem("Oblicz obwód równoległoboku");
		mParallelogram.add(miObwódRównoległobok);
		miPoleRomb = new JMenuItem("Oblicz pole rombu");
		mRhombus.add(miPoleRomb);
		miObwódRomb = new JMenuItem("Oblicz obwód rombu");
		mRhombus.add(miObwódRomb);
		miPoleTrapez = new JMenuItem("Oblicz pole trapezu");
		mTrapeze.add(miPoleTrapez);
		miObwódTrapez = new JMenuItem("Oblicz obwód trapezu");
		mTrapeze.add(miObwódTrapez);
		
		
		
		miFieldCircle.addActionListener(this);
		miCircuitCircle.addActionListener(this);
		miFieldQuadrat.addActionListener(this);
		miCircuitQuadreat.addActionListener(this);
		miFieldRectangle.addActionListener(this);
		miCircuitRectangle.addActionListener(this);
		miPoleTrójkąt.addActionListener(this);
		miObwódTrójkąt.addActionListener(this);
		miPoleRównoległobok.addActionListener(this);
		miObwódRównoległobok.addActionListener(this);
		miPoleRomb.addActionListener(this);
		miObwódRomb.addActionListener(this);
		miPoleTrapez.addActionListener(this);
		miObwódTrapez.addActionListener(this);
		miExit.addActionListener(this);
	}
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object z = e.getSource();
		
		

		if ( z == miAboutProject)
		{
			JOptionPane.showMessageDialog(this, "                                           Cześć \n Mam na imię Krzysiek, jest to mój pierwszy projekt w Javie z użyciem Swinga \n                                  Pozdrawiam","O Projekcie", JOptionPane.INFORMATION_MESSAGE);
		}
		else if (z == miFieldCircle)
		{
		LayoutPoleKoło obiekt = new LayoutPoleKoło();
		
		}
		else if (z == miCircuitCircle)
		{
		LayoutObwódKoło obiekt = new LayoutObwódKoło();
		
		} 
		else if (z == miFieldQuadrat)
		{
			LayoutPoleKwadrat obiekt = new LayoutPoleKwadrat();
			
			
			
		} 
		else if (z == miCircuitQuadreat)
		{
			LayoutObwódKwadrat obiekt = new LayoutObwódKwadrat();
			
			
		}
		else if (z == miFieldRectangle)
		{
			LayoutPoleProstokąt obiekt = new LayoutPoleProstokąt();
			
			
		}
		else if (z == miCircuitRectangle)
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
		
		else if (z == miExit)
		{
			dispose();
		}
		
		
		
	}










	public static void main(String[] args) {

		Layout appMenu = new Layout();
		appMenu.setVisible(true);
		
	}

}
