/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter09_Objects_practice;

/**
 *
 * @author Server
 */
public class TestTax {
    public static void main(String[] args) {
        Tax t = new Tax();
        System.out.println("Tax for income of $" + t.getTaxableIncome()+ ":  " + t.getTax());
        t.setTaxableIncome(350_000);
        System.out.println("Tax for income of $" + t.getTaxableIncome()+ ":  " + t.getTax());
        t.setTaxableIncome(1_000);
        System.out.println("Tax for income of $" + t.getTaxableIncome()+ ":  " + t.getTax());
        
        
        int filingStatus = Tax.MARRIED_JOINTLY;
        int [][]brackets = {
            {28_050, 64_550, 137_750, 297_350},
            {46_200, 11_9250, 166_500, 297_350},
            {25_600, 53_625, 89_250, 150_675},
            {37_250, 95_650, 153_650, 300_350}
        };
        double[] rates = {0.20, 0.275, 0.315, 0.4, 0.47};
        double taxableIncome = 250_001.45;
        
        Tax t2 = new Tax(filingStatus, brackets, rates, taxableIncome);
        System.out.println("Tax for income of $" + t2.getTaxableIncome()+ ":  " + t2.getTax());
    }
}
