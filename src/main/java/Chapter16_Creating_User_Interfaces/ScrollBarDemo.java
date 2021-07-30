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
import javax.swing.JScrollBar;

/**
 *
 * @author Cliftonb
 */
public class ScrollBarDemo extends JFrame{

	private MessagePanel messagePanel = new MessagePanel();
	private JScrollBar horizontalBar = new JScrollBar(JScrollBar.HORIZONTAL);
	private JScrollBar verticalBar = new JScrollBar(JScrollBar.VERTICAL);

	public ScrollBarDemo() {
		setLayout(new BorderLayout());
		add(messagePanel, BorderLayout.CENTER);
		add(horizontalBar, BorderLayout.SOUTH);
		add(verticalBar, BorderLayout.EAST);
		
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
		horizontalBar.addAdjustmentListener(new AdjustmentListener() {
			@Override
			public void adjustmentValueChanged(AdjustmentEvent e) {
				messagePanel.setxPos(horizontalBar.getValue());
			}
		});
		verticalBar.addAdjustmentListener(new AdjustmentListener() {
			@Override
			public void adjustmentValueChanged(AdjustmentEvent e) {
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
		ScrollBarDemo frame = new ScrollBarDemo();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setTitle("ScrollBarDemo");
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.initialise();


	}
}
