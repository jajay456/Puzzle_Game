package pj;

import java.awt.EventQueue;
import java.awt.*;  
import javax.swing.*;  
import java.awt.event.*;  
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Gui implements ActionListener{
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui window = new Gui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setAlwaysOnTop(true);
		frame.getContentPane().setBackground(new Color(128, 128, 128));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 206, 94));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("GAME PUZZLE");
		lblNewLabel.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 23));
		lblNewLabel.setForeground(new Color(128, 128, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		panel.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(128, 128, 255));
		frame.getContentPane().add(panel_2, BorderLayout.WEST);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\jajay\\eclipse-workspace\\ProjectCP112\\pj\\src\\pj\\img\\970bcefbee89b81b4ca93653796b29c4.jpg"));
		panel_2.add(lblNewLabel_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(128, 128, 255));
		frame.getContentPane().add(panel_3, BorderLayout.EAST);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBackground(new Color(0, 0, 0));
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\jajay\\eclipse-workspace\\ProjectCP112\\pj\\src\\pj\\img\\970bcefbee89b81b4ca93653796b29c4.jpg"));
		panel_3.add(lblNewLabel_2);
		
		JPanel panel_4 = new JPanel();
		frame.getContentPane().add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(null);
		panel_5.setBackground(new Color(255, 233, 104));
		panel_4.add(panel_5, BorderLayout.CENTER);
		
		JButton btnHelp = new JButton("H");
		btnHelp.setBounds(142, 88, 273, 66);
		btnHelp.addActionListener(this);
		btnHelp.setForeground(new Color(255, 233, 104));
		btnHelp.setIcon(new ImageIcon("C:\\Users\\jajay\\Downloads\\help.png"));
		btnHelp.setBackground(new Color(255, 233, 104));
		panel_5.setLayout(null);
		panel_5.add(btnHelp);
		
		JButton btnPlay_1 = new JButton("Pe");
		btnPlay_1.setIcon(new ImageIcon("C:\\Users\\jajay\\Downloads\\ez.png"));
		btnPlay_1.addActionListener(this);
		btnPlay_1.setToolTipText("");
		btnPlay_1.setForeground(new Color(255, 233, 104));
		btnPlay_1.setBackground(new Color(255, 233, 104));
		btnPlay_1.setBounds(10, 11, 264, 75);
		panel_5.add(btnPlay_1);
		
		JButton btnPlay_1_1 = new JButton("Ph");
		btnPlay_1_1.setIcon(new ImageIcon("C:\\Users\\jajay\\Downloads\\hard.png"));
		btnPlay_1_1.addActionListener(this);
		btnPlay_1_1.setToolTipText("");
		btnPlay_1_1.setForeground(new Color(255, 233, 104));
		btnPlay_1_1.setBackground(new Color(255, 233, 104));
		btnPlay_1_1.setBounds(294, 11, 259, 75);
		panel_5.add(btnPlay_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBackground(new Color(192, 192, 192));
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\jajay\\eclipse-workspace\\ProjectCP112\\pj\\src\\pj\\img\\Game PUZZLE.png"));
		panel_4.add(lblNewLabel_3, BorderLayout.NORTH);
		frame.setBounds(100, 100, 937, 556);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		
		// TODO Auto-generated method stub
		String buttonName = ((JButton)event.getSource()).getText();
		
		if(buttonName == "Pe") { 
			frame.dispose();
			new TimeCounter();
			
		}
		if(buttonName == "Ph") { 
			frame.dispose();
			new TimeCounter_H();
			
		}
		if(buttonName == "H") { 

			JOptionPane.showMessageDialog(null,"HOW TO PLAY THIS GAME\r\n"
					+ "Slide to move numbers. Can scroll both up, down, left, right into the empty space\r\n"
					+"Sorting numbers from 1-8 will be successful. or \r\n"
					+ "Sorting numbers from 1-15 will be successful.\r\n"
					+ "There is a timer to increase the challenge. and record the fastest time (minimum) that the player can do");
			
	}
}
}
