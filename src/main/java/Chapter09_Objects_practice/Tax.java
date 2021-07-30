/**
 * 
 * TAX
 * --------------------
 * - filingStatus: int
 * - brackets: int [][]
 * - rates: double []
 * - taxableIncome: double
 * --------------------
 * + Tax()
 * + Tax(filingStatus: int, brackets: int [][], rates: int[], taxableIncome: double)
 * + getFilingStatus(): int
 * + setFilingStatus(filingStatus: int) : void
 * + getBrackets(): int[][]
 * + setBrackets(brackets: int[][]) : void
 * + getRates(): double []
 * + setRates(rates: double[]) : void
 * + getTaxableIncome(): double
 * + setTaxableIncome(taxableIncome: double): void
 * + getTax() : double
 * 
 **/
package Chapter09_Objects_practice;

/**
 *
 * @author Server
 */
public class Tax {
    
    //the only possible filingStatus'
    public static final int SINGLE_FILER = 0;
    public static final int MARRIED_JOINTLY = 1;
    public static final int MARRIED_SEPERATELY = 2;
    public static final int HEAD_OF_HOUSEHOLD = 3;
    
    private int filingStatus;
    private int[][] brackets;
    private double[] rates;
    private double taxableIncome;
    
    public Tax(){
        //default to the 2001 Tax Rates with a single filer and $100 000 taxable income
        this.filingStatus = SINGLE_FILER;
        this.brackets = new int[][]{
            {27_050, 65_550, 136_750, 297_350},
            {45_200, 10_9250, 166_500, 297_350},
            {22_600, 54_625, 83_250, 148_675},
            {36_250, 93_650, 151_650, 297_350}
        };
        this.rates = new double[]{0.15, 0.275, 0.305, 0.355, 0.391};
        this.taxableIncome = 100_000;
    }
    
    public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome){
        this.filingStatus = filingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }

    public int getFilingStatus() {
        return filingStatus;
    }

    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }

    public int[][] getBrackets() {
        return brackets;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }

    public double[] getRates() {
        return rates;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }
    
    public double getTax(){
        double tax = 0;
        
        double remainingTaxableIncome = this.taxableIncome;
        int bracket = 0;
        int previousBracketLimit = 0;
        
        //go through each bracket and add the taxable amount to tax
        while(remainingTaxableIncome > 0){
            //if we have gone past the final bracket limit...
            
            if(bracket == brackets[filingStatus].length){
                tax += remainingTaxableIncome * rates[bracket];
                break;
            }
            //if we have found the final bracket...
            else if(taxableIncome < brackets[filingStatus][bracket]){
                tax += remainingTaxableIncome * rates[bracket];
                break;
            }
            else{
                int bracketDifference = brackets[filingStatus][bracket] - previousBracketLimit;
                tax += (bracketDifference)*rates[bracket]; 
                remainingTaxableIncome -= bracketDifference;
                previousBracketLimit = brackets[filingStatus][bracket];
            }
            
            //go to the next bracket
            bracket++;
        }
        
        return tax;
    }
        
}
