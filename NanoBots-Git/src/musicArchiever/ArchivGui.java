package musicArchiever;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ArchivGui implements ActionListener {
	
	JButton btnReset;
	JButton btnExists;
	JButton btnSave;
	JButton btnSearch;
	JButton btnAll;
	

	ArchivGui()
	{
		JFrame frame = new JFrame();
		GridLayout lo = new GridLayout(5,1);
		
	    JPanel panel1 = new JPanel();
	    JPanel panel2 = new JPanel();
	    JPanel panel3 = new JPanel();
	    JPanel panel4 = new JPanel();
	    JPanel panel5 = new JPanel();
		
		
		
		JTextField tfInt = new JTextField(20);
		JTextField tfAut = new JTextField(20);
		JScrollPane spArch = new JScrollPane();
		
		JLabel lblInt = new JLabel("Interpret");
		lblInt.setSize(10, 10);
		JLabel lblAut = new JLabel("Author");
		lblAut.setSize(10, 10);
		
		btnReset = new JButton("Reset");
		btnExists = new JButton("Eintrag vorhanden");
		btnSave = new JButton("Speichern");
		btnSearch = new JButton("Suchen");
		btnAll = new JButton("Alle");
		
	    JTextArea ta = new JTextArea(3,40);
	    
   
	    JScrollPane pane = new JScrollPane(ta);
	      
	 
	    

		
		//frame.setSize(800, 600);
	    panel1.setSize(40, 5);
		panel1.add(lblInt);
		panel1.add(tfInt);
		
		btnAll.addActionListener(this);
		btnExists.addActionListener(this);
		btnReset.addActionListener(this);
		btnSave.addActionListener(this);
		btnSearch.addActionListener(this);
		
		
		panel1.setSize(40, 5);
		panel2.add(lblAut);
		panel2.add(tfAut);
		
	    panel3.add(new JLabel());
	    panel3.add(new JLabel());
	    
	    panel4.add(btnReset);
	    panel4.add(btnExists);
	    panel4.add(btnSave);
	    panel4.add(btnSearch);
	    panel4.add(btnAll);
	    
	    panel5.add(pane);
	    
	    
	    frame.add(panel1);
	    frame.add(panel2);
	    frame.add(panel4);
	    frame.add(panel3);
	    frame.add(panel5);
		
		
		
		frame.setLayout(lo);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}
	public static void main(String[] args) {
		ArchivGui gui = new ArchivGui();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(btnAll))
		{
			
		}
		if (e.getSource().equals(btnExists))
		{
			
		}
		if (e.getSource().equals(btnReset))
		{

		}
		if (e.getSource().equals(btnSearch))
		{

		}
		if (e.getSource().equals(btnSave))
		{

		}
		
	}
	
	public String ReadFile()
	{
		
		try {
			FileReader fr = new FileReader(new File("C:\\Archiv.txt"));
			
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFound!");
			e.printStackTrace();
		}
		return null;
		//
	}
	
}
