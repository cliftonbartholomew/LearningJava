/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter15_Event_Driven_Programming;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Cliftonb
 */
public class AnonymousListenerDemo extends JFrame{
	public AnonymousListenerDemo(){
		JButton ok = new JButton("OK");
		JButton cancel = new JButton("Cancel");
		JButton print = new JButton("Print");
		JButton save= new JButton("Save");

		JPanel p = new JPanel();
		p.add(ok);
		p.add(cancel);
		p.add(print);
		p.add(save);

		//these classes do not have names. It is an anynonymous object of an interface with all the implemented methods.
		//these are called anonymous inner classes. They are inner classes without a name.
		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				System.out.println("Process OK");
			}
		});
		
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				System.out.println("Process cancel");
			}
		});


		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				System.out.println("Process save");
			}
		});

		print.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				System.out.println("Process print");
			}
		});

		p.add(ok);
		p.add(cancel);
		p.add(print);
		p.add(save);
		this.add(p);
	}	

	public static void main(String[] args) {
		JFrame frame = new AnonymousListenerDemo();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(frame);
		frame.setTitle("Anonymous Inner");
		frame.pack();
		frame.setVisible(true);
	}
}
