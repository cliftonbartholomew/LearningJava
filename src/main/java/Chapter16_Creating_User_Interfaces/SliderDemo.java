/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter16_Creating_User_Interfaces;

import java.awt.BorderLayout;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Cliftonb
 */

public class SliderDemo extends JFrame{

	private MessagePanel messagePanel = new MessagePanel();
	private JSlider horizontalBar = new JSlider(JSlider.HORIZONTAL);
	private JSlider verticalBar = new JSlider(JSlider.VERTICAL);

	public SliderDemo() {
		setLayout(new BorderLayout());
		add(messagePanel, BorderLayout.CENTER);
		add(horizontalBar, BorderLayout.SOUTH);
		add(verticalBar, BorderLayout.EAST);
		
		horizontalBar.setPaintLabels(true);
		horizontalBar.setPaintTicks(true);
		horizontalBar.setPaintTrack(true);
		horizontalBar.setMajorTickSpacing(100);
		horizontalBar.setMinorTickSpacing(10);

		verticalBar.setInverted(true);
		verticalBar.setPaintLabels(true);
		verticalBar.setPaintTicks(true);
		verticalBar.setPaintTrack(true);
		verticalBar.setMajorTickSpacing(100);
		verticalBar.setMinorTickSpacing(10);

		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e){

				int currentX = horizontalBar.getValue();
				int currentY = verticalBar.getValue();


				switch(e.getKeyCode()){
					case KeyEvent.VK_UP:
						if(currentY > 0)
							verticalBar.setValue(currentY - 1);
						break;
					case KeyEvent.VK_DOWN:
						if(currentY < messagePanel.getHeight())
							verticalBar.setValue(currentY + 1);
						break;
					case KeyEvent.VK_LEFT:
						if(currentX > 0)
							horizontalBar.setValue(currentX - 1);
						break;
					case KeyEvent.VK_RIGHT:
						if(currentX < messagePanel.getWidth())
							horizontalBar.setValue(currentX + 1);
						break;
				}
			}
		});

		messagePanel.setIsCentered(false);
		horizontalBar.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				messagePanel.setxPos(horizontalBar.getValue());
			}
		});
		verticalBar.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				messagePanel.setyPos(verticalBar.getValue());
			}
		});
	}

	public void initialise(){
		horizontalBar.setMinimum(0);
		horizontalBar.setMaximum(messagePanel.getWidth());
		verticalBar.setMinimum(0);
		verticalBar.setMaximum(messagePanel.getHeight());

	}


	public static void main(String[] args) {
		SliderDemo frame = new SliderDemo();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setTitle("ScrollBarDemo");
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.initialise();


	}
}