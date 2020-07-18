/* Programmer:  Mat Nicholls
 * Date:        12/4/18
 * Chapter:     Final Project
 * Exercise:    Final Project
 * Purpose:     Class for ShiftTotal objects
 */
package pkgfinal.project;

public class ShiftTotals {
    // declare attributes
    private String section;
    private double totalSales;
    private double totalTips;
    private double alcoholSales;
    private double barTipOut;
    
    /**
     * The ShiftTotals() method is a void constructor 
    */
    public ShiftTotals() {
        section = "";
        totalSales = 0.0;
        totalTips = 0.0;
        alcoholSales = 0.0;
        barTipOut = 0.0;
    }
    
    /**
     * The ShiftTotals() method is a constructor that initializes with values 
     * for each attribute
     */
    public ShiftTotals(String s, double ts, double tt, double as, double to) {
        section = s;
        totalSales = ts;
        totalTips = tt;
        alcoholSales = as;
        barTipOut = to;
    }
    
    /**
     * The setSection() method accepts a value for the section
     */
    public void setSection(String s) {
        section = s;
    }
    
    /**
     * The setTotalSales() method accepts a value for total sales
     */
    public void setTotalSales(double ts) {
        totalSales =ts;
    }
    
    /**
     * The setTotalTips() method accepts a value for total tips
     */
    public void setTotalTips(double tt) {
        totalTips = tt;
    }
    
    /**
     * The setAlcoholSales() method accepts a value for alcohol sales
     */
    public void setAlcoholSales(double as) {
        alcoholSales = as;
    }
    
    /**
     * The setBarTipOut() method accepts a value for the bar tip out
     */
    public void setBarTipOut(double to) {
        barTipOut = to;
    }
    
    /**
     * The getSection() method returns the value of section
     */
    public String getSection() {
        return section;
    }
    
    /**
     * The getTotalSales() method returns the value of total sales
     */
    public double getTotalSales() {
        return totalSales;
    }
    
    /**
     * The getTotalTips() method returns the value of total tips
     */
    public double getTotalTips() {
        return totalTips;
    }
    
    /**
     * The getAlcoholSales() method returns the value of alcohol sales
     */
    public double getAlcoholSales() {
        return alcoholSales;
    }
    
    /**
     * The getBarTipout() method calculates and returns the value of bar tip out
     */
    public double getBarTipOut() {
        //variables being used
        final double BAR_PERCENTAGE = .05;
        
        barTipOut = getAlcoholSales() * BAR_PERCENTAGE;
        
        return barTipOut;
    }
    
    /**
     * The getNetTips() method calculates and returns the value of net tips
     */
    public double calcNetTips() {
        
        return totalTips - barTipOut;
    }
}
