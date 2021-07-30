/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter16_Creating_User_Interfaces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Cliftonb
 */
public class ListDemo extends JFrame{
	public ListDemo(){
		add(new FlagPanel());
	}

	public static void main(String[] args) {
		JFrame frame = new ListDemo();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("ListDemo");
		frame.setLocationRelativeTo(null);
		frame.setSize(400, 400);
		frame.setVisible(true);
	}

	public class FlagPanel extends JPanel{
		private String [] countries = {"Algeria", "America", "Danish", "Italy", "Khazak" , "South Africa"};

		private JList countryList = new JList(countries);
		
		//the labels to hold the images
		private JLabel [] imageViewer = new JLabel[countries.length];

		//the images to be displayed
	        private ImageIcon [] flagIcons = {
			new ImageIcon("images/algeria.png"),
			new ImageIcon("images/america.png"),
			new ImageIcon("images/danish.png"),
			new ImageIcon("images/italy.png"),
			new ImageIcon("images/khazak.png"),
			new ImageIcon("images/south africa.png")
		};		
		public FlagPanel(){
			setLayout(new BorderLayout());

			//create and add a scrollable list to the left of the panel
			JScrollPane countryListPane = new JScrollPane(countryList);
			countryList.setVisibleRowCount(4);//sets how many items in the list can be viewed at the same time
			countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);//other two are SINGLE_SELECTION and  SINGLE_INTERVAL_SELECTION
			countryList.setSelectionBackground(Color.lightGray);
			countryList.setSelectionForeground(Color.darkGray);
			add(countryListPane, BorderLayout.WEST);

			//add and initialie 6 labels to the right hand panel 
			JPanel flagPanel = new JPanel(new GridLayout(2,3,5,5));
			for(int i = 0; i < 6; i++){
				imageViewer[i] = new JLabel();
				flagPanel.add(imageViewer[i]);
				imageViewer[i].setHorizontalAlignment(SwingConstants.CENTER);
			}
			add(flagPanel, BorderLayout.CENTER);

			//add the event listeners
			countryList.addListSelectionListener(new ListSelectionListener() {
				public void valueChanged(ListSelectionEvent e) {

					int[] indices = countryList.getSelectedIndices();
					int i = 0;
					for(i = 0; i < indices.length; i ++){

						imageViewer[i].setIcon(flagIcons[indices[i]]);
					}

					for(; i<6; i++){
						imageViewer[i].setIcon(null);
					}
				}
			});
		}
	}	
}
