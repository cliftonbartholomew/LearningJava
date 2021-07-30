/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter16_Creating_User_Interfaces;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Cliftonb
 */
public class CheckBoxDemo extends ButtonDemo{
	private JCheckBox chkbxCentered = new JCheckBox("Centered");
	private JCheckBox chkbxBold = new JCheckBox("Bold");
	private JCheckBox chbkxItalic = new JCheckBox("Italix");

	public CheckBoxDemo(){
		JPanel checkBoxPanel = new JPanel(new GridLayout(3,1 ));
		checkBoxPanel.add(chkbxBold);
		checkBoxPanel.add(chbkxItalic);
		checkBoxPanel.add(chkbxCentered);

		add(checkBoxPanel, BorderLayout.EAST);

		chkbxBold.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setFont();
			}
		});

		chbkxItalic.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setFont();
			}
		});

		chkbxCentered.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textPanel.setIsCentered(chkbxCentered.isSelected());
			}
		});
	}

	private void setFont(){
		int fontStyle = Font.PLAIN;
		fontStyle += (chkbxBold.isSelected() ? Font.BOLD : Font.PLAIN);
		fontStyle += (chbkxItalic.isSelected() ? Font.ITALIC : Font.PLAIN);

		Font f = textPanel.getFont();
		textPanel.setFont(new Font(f.getName(), fontStyle, f.getSize()));
	}


	public static void main(String[] args) {
		JFrame frame = new CheckBoxDemo();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setTitle("CheckBoxDemo");
		frame.setVisible(true);
	}
}
