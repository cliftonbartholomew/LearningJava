/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter16_Creating_User_Interfaces;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Cliftonb
 */
public class MultipleWindowsDemo extends JFrame{
	JTextArea jta = new JTextArea("");
	JButton generateHistogramButton = new JButton("Generate Histogram");
	HistoFrame histoFrame = new HistoFrame();

	public MultipleWindowsDemo(){
		//a scroll panel uses a 'view', I must figure out what this is.
		//remember to add the component to the scrollpane through the constructor
		// and not the add() method.
		JScrollPane scrollPanel = new JScrollPane(jta);

		//setup the button actionlistener
		generateHistogramButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				histoFrame.setOccurrenLetters(getLetterCount());
				histoFrame.displayHistogram();
			}
		});
		//setup the main panel to hold the text area and button
		JPanel mainPanel = new JPanel();	
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(scrollPanel, BorderLayout.CENTER);
		mainPanel.add(generateHistogramButton, BorderLayout.SOUTH);

		//add the main panel to the frame
		add(mainPanel);


		//initialise the main frame
		setTitle("MutlipleWindwosDemo");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
	}

	public int[] getLetterCount(){
		String messageText = jta.getText();
		int[] letterOccurence = new int[26];
		Arrays.fill(letterOccurence, 0);
		//reset the array
		for(int i = 0; i < messageText.length(); i++){
			if(Character.isAlphabetic(messageText.charAt(i))){
				int position = (int)Character.toLowerCase(messageText.charAt(i)) - (int)('a');
				letterOccurence[position]++;
			}
		}

		return letterOccurence;
	}
	public static void main(String[] args) {

		MultipleWindowsDemo frame = new MultipleWindowsDemo();

	}

	public class HistoFrame extends JFrame{

		int [] occurrenceLetters = new int[26];
		Histogram h;


		public HistoFrame(){
			//setup the histoframe
			setTitle("Histogram of letter frequencies");
			setSize(500, 500);
			setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			setLocationRelativeTo(null);
			addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {

					hideHistogram();
				}
			});

		}

		public void setOccurrenLetters(int [] occurrenceLetters){
			this.occurrenceLetters = occurrenceLetters;
		}
		public void displayHistogram(){
			h = new Histogram(occurrenceLetters);
			add(h);
			setVisible(true);
		}
		public void hideHistogram(){
			remove(h);
			setVisible(false);
		}
	}
	
}
