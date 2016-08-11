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

import com.zielomapatelnia.layout.LayoutCircuitCircle;
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
	private JMenuItem miAboutProject, miExit, miFieldCircle, miCircuitCircle, miFieldQuadrat, miCircuitQuadreat, miFieldRectangle,
	miCircuitRectangle, miFieldTriangle, miCircuitTriangle, miFieldParallelogram, miCircuitParallelogram,miFieldRhombus,miCircuitRhombus,
	miFieldTrapeze,miCircuitTrapeze;
	
	
	
	
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
		miFieldTriangle = new JMenuItem("Oblicz pole trójkąta");
		mTriangle.add(miFieldTriangle);
		miCircuitTriangle = new JMenuItem("Oblicz obwód trójkąta");
		mTriangle.add(miCircuitTriangle);
		miFieldParallelogram = new JMenuItem("Oblicz pole równoległoboku");
		mParallelogram.add(miFieldParallelogram);
		miCircuitParallelogram = new JMenuItem("Oblicz obwód równoległoboku");
		mParallelogram.add(miCircuitParallelogram);
		miFieldRhombus = new JMenuItem("Oblicz pole rombu");
		mRhombus.add(miFieldRhombus);
		miCircuitRhombus = new JMenuItem("Oblicz obwód rombu");
		mRhombus.add(miCircuitRhombus);
		miFieldTrapeze = new JMenuItem("Oblicz pole trapezu");
		mTrapeze.add(miFieldTrapeze);
		miCircuitTrapeze = new JMenuItem("Oblicz obwód trapezu");
		mTrapeze.add(miCircuitTrapeze);
		
		
		
		miFieldCircle.addActionListener(this);
		miCircuitCircle.addActionListener(this);
		miFieldQuadrat.addActionListener(this);
		miCircuitQuadreat.addActionListener(this);
		miFieldRectangle.addActionListener(this);
		miCircuitRectangle.addActionListener(this);
		miFieldTriangle.addActionListener(this);
		miCircuitTriangle.addActionListener(this);
		miFieldParallelogram.addActionListener(this);
		miCircuitParallelogram.addActionListener(this);
		miFieldRhombus.addActionListener(this);
		miCircuitRhombus.addActionListener(this);
		miFieldTrapeze.addActionListener(this);
		miCircuitTrapeze.addActionListener(this);
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
		LayoutPoleKoło frame = new LayoutPoleKoło();
		
		}
		else if (z == miCircuitCircle)
		{
		LayoutCircuitCircle frame = new LayoutCircuitCircle();
		
		} 
		else if (z == miFieldQuadrat)
		{
			LayoutPoleKwadrat frame = new LayoutPoleKwadrat();
			
			
			
		} 
		else if (z == miCircuitQuadreat)
		{
			LayoutObwódKwadrat frame = new LayoutObwódKwadrat();
			
			
		}
		else if (z == miFieldRectangle)
		{
			LayoutPoleProstokąt frame = new LayoutPoleProstokąt();
			
			
		}
		else if (z == miCircuitRectangle)
		{
			
			
			LayoutObwódProstokąt frame = new LayoutObwódProstokąt();
			
		}
		else if (z == miFieldTriangle)
		{
			LayoutPoleTrójkąt frame = new LayoutPoleTrójkąt();
		}
		else if (z == miCircuitTriangle)
		{
			LayoutObwódTrójkąt frame = new LayoutObwódTrójkąt();
			
		}
		else if (z == miFieldParallelogram)
		{
			LayoutPoleRównoległobok frame = new LayoutPoleRównoległobok();
			
		}
		else if (z == miCircuitParallelogram)
		{
			LayoutObwódRównoległobok frame = new LayoutObwódRównoległobok();	
			
		
		}
		else if (z == miFieldRhombus)
		{
			LayoutPoleRomb frame = new LayoutPoleRomb();
			
			
		}
		else if (z == miCircuitRhombus)
		{
			
			LayoutObwódRomb frame = new LayoutObwódRomb();
			
			
		}
		else if (z == miFieldTrapeze)
		{
			
			
			LayoutPoleTrapez frame = new LayoutPoleTrapez();
			
			
		}
		else if (z == miCircuitTrapeze)
		{
			LayoutObwódTrapez frame = new LayoutObwódTrapez();
			
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
