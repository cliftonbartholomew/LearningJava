/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Misc;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class NumTiles {

	public static void main(String[] args) {
		int length = Integer.parseInt(JOptionPane.showInputDialog("What is the length"));
		long sum = 0;
		long count = 1;
		for (int i = 1; i <= length; i++) {
			System.out.println("");
			if (i % 2 == 1) {
				sum += count;
			}
			count *= 2;
			System.out.println("");

		}
		System.out.println(sum);
	}

}
