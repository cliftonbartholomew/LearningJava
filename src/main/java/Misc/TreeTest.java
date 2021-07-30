/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Misc;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Cliftonb
 */
public class TreeTest extends JFrame{

	private JTree tree;
	public TreeTest() {
		DefaultMutableTreeNode top = new DefaultMutableTreeNode("The Java Series");
		createNodes(top);
		
		tree = new JTree(top);

		JScrollPane pane = new JScrollPane(tree);
		add(pane);
	}

	public static void main(String[] args) {
		TreeTest frame = new TreeTest();
		frame.setSize(200,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setTitle("TreeTest");
		frame.setVisible(true);
	}

	private void createNodes(DefaultMutableTreeNode top) {
		DefaultMutableTreeNode category = null;
		DefaultMutableTreeNode book = null;

		category = new DefaultMutableTreeNode("Books for Java Programmers");
		top.add(category);

		//original Tutorial
		book = new DefaultMutableTreeNode("The Java Tutorial: A Short Course on the Basics");
		category.add(book);

		//Tutorial Continued
		book = new DefaultMutableTreeNode("The Java Tutorial Continued: The Rest of the JDK");
		category.add(book);

		//Swing Tutorial
		book = new DefaultMutableTreeNode("The Swing Tutorial: A Guide to Constructing GUIs");
		category.add(book);

		//...add more books for programmers...
		category = new DefaultMutableTreeNode("Books for Java Implementers");
		top.add(category);

		//VM
		book = new DefaultMutableTreeNode("The Java Virtual Machine Specification");
		category.add(book);

		//Language Spec
		book = new DefaultMutableTreeNode("The Java Language Specification");
		category.add(book);
	}

}
