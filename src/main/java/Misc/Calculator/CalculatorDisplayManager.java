/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Misc.Calculator;

/**
 *
 * @author Cliftonb
 */
public class CalculatorDisplayManager {
	private String topDisplay; 
	private String mainDisplay;
	private boolean firstNumber;
	
	public CalculatorDisplayManager(){
		this.topDisplay = "";
		this.mainDisplay = "";
		this.firstNumber = false;
	}	

	public String clickButton(char buttonType){
			
		this.topDisplay += buttonType;
		return this.topDisplay;
		
	}

	public String getDisplay(){
		return this.topDisplay;
	}
	public static void main(String[] args) {
		CalculatorDisplayManager cm = new CalculatorDisplayManager();

		cm.clickButton(ButtonType.TWO_BUTTON);
		System.out.println(cm.getDisplay());
	}

}
