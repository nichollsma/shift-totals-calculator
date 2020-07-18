/* Programmer:  Mat Nicholls
 * Date:        12/4/18
 * Chapter:     Final Project
 * Exercise:    Final Project
 * Purpose:     Testing program with menu for ShiftTotals class
 */
package pkgfinal.project;
import javax.swing.JOptionPane;

public class FinalProject {
    
    public static void main(String[] args) {
        // declare variables
        String testSection;
        int menuChoice;
        double testSales;
        double testTips;
        double testAlcoholSales;
        double testTipOut;
        
        // initialize instance of ShiftTotals class using no-arg constructor
        ShiftTotals testTotals = new ShiftTotals();
        
        // display menu to recieve initial reading
        menuChoice = getMenuChoice();
        
        // sentinal loop for menu
        while (menuChoice != 13) {
            if (menuChoice == 1) {
                JOptionPane.showMessageDialog(null,String.format("Section: %8s"
                        ,testTotals.getSection()));
            }
            
            else if (menuChoice == 2) {
                JOptionPane.showMessageDialog(null,String.format("Total Sales: "
                        + "$%,8.2f",testTotals.getTotalSales()));
            }
            
            else if (menuChoice == 3) {
                JOptionPane.showMessageDialog(null,String.format("Total Tips: "
                        + "$%,8.2f",testTotals.getTotalTips()));
            }
            
            else if (menuChoice == 4) {
                JOptionPane.showMessageDialog(null,String.format("Alcohol "
                        + "Sales: $%,8.2f",testTotals.getAlcoholSales()));
            }
            
            else if (menuChoice == 5) {
                JOptionPane.showMessageDialog(null,String.format("Bar Tip Out: "
                        + "$%,8.2f",testTotals.getBarTipOut()));
            }
            
            else if (menuChoice == 6) {
                testTotals.setSection(JOptionPane.showInputDialog("Please enter"
                        + " the section:"));
            }
            
            else if (menuChoice == 7) {
                testTotals.setTotalSales(Double.parseDouble(JOptionPane.
                        showInputDialog("Please enter the total sales:")));
                while (testTotals.getTotalSales() < 0.0) {
                    JOptionPane.showMessageDialog(null,"Invalid input, please "
                            + "enter a positive value.");
                    testTotals.setTotalSales(Double.parseDouble(JOptionPane.
                        showInputDialog("Please enter the total sales:")));
                }
            }
            
            else if (menuChoice == 8) {
                testTotals.setTotalTips(Double.parseDouble(JOptionPane.
                        showInputDialog("Please enter the total tips:")));
                while (testTotals.getTotalTips() < 0.0) {
                    JOptionPane.showMessageDialog(null,"Invalid input, please "
                            + "enter a positive value.");
                    testTotals.setTotalTips(Double.parseDouble(JOptionPane.
                        showInputDialog("Please enter the total tips:")));
                }
            }
            
            else if (menuChoice == 9) {
                testTotals.setAlcoholSales(Double.parseDouble(JOptionPane.
                        showInputDialog("Please enter the alcohol sales:")));
                while (testTotals.getAlcoholSales() < 0.0) {
                    JOptionPane.showMessageDialog(null,"Invalid input, please "
                            + "enter a positive value.");
                    testTotals.setAlcoholSales(Double.parseDouble(JOptionPane.
                        showInputDialog("Please enter the alcohol sales:")));
                }
            }
            
            else if (menuChoice == 10) {
                testTotals.setBarTipOut(Double.parseDouble(JOptionPane.
                        showInputDialog("Please enter the bar tip out:")));
                while (testTotals.getBarTipOut() < 0.0) {
                    JOptionPane.showMessageDialog(null,"Invalid input, please "
                            + "enter a positive value.");
                    testTotals.setBarTipOut(Double.parseDouble(JOptionPane.
                        showInputDialog("Please enter the bar tip out:")));
                }
            }
            
            else if (menuChoice == 11) {
                JOptionPane.showMessageDialog(null,String.format(
                          "%-25s $%,-8.2f\n"
                        + "%-25s $%,-8.2f\n\n"
                        + "%-25s $%,-8.2f",
                        "Total Tips:",  testTotals.getTotalTips(),
                        "Bar Tip Out:", testTotals.getBarTipOut(),
                        "Net Tips:",    testTotals.calcNetTips()));
            }
            else {
                JOptionPane.showMessageDialog(null,String.format(
                          "%-25s %-1s\n"
                        + "%-24s $%,8.2f\n"
                        + "%-26s $%,8.2f\n"
                        + "%-22s $%,8.2f\n"
                        + "%-25s $%,8.2f\n",
                        "Section:",         testTotals.getSection(),
                        "Total Sales:",     testTotals.getTotalSales(),
                        "Total Tips:",      testTotals.getTotalTips(),
                        "Alcohol Sales:",   testTotals.getAlcoholSales(),
                        "Bar Tip Out:",     testTotals.getBarTipOut()));
            }
            
            // get next reading
            menuChoice = getMenuChoice();
        }
        // close the program if 13 is selected
        System.exit(0);
    }
    
    public static int getMenuChoice() {
        // declare variables
        int menuChoice;
        
        menuChoice = Integer.parseInt(JOptionPane.showInputDialog("Menu:\n"
                +  "1. Display section\n"
                +  "2. Display total sales\n"
                +  "3. Display total tips\n"
                +  "4. Display alcohol sales\n"
                +  "5. Display bar tip out\n"
                +  "6. Set section\n"
                +  "7. Set total sales\n"
                +  "8. Set total tips\n"
                +  "9. Set alcohol sales\n"
                + "10. Set bar tip out\n"
                + "11. Calculate net tips for the shift\n"
                + "12. Display all field variables for the item\n"
                + "13. Exit\n"));
        
        // validate choice
        while (menuChoice < 1 || menuChoice > 13) {
            JOptionPane.showMessageDialog(null, "Invalid input, please enter a"
                    + " number from 1 to 13.");
            
            // get choice again
            menuChoice = Integer.parseInt(JOptionPane.showInputDialog("Menu:\n"
                +  "1. Display section\n"
                +  "2. Display total sales\n"
                +  "3. Display total tips\n"
                +  "4. Display alcohol sales\n"
                +  "5. Display bar tip out\n"
                +  "6. Set section\n"
                +  "7. Set total sales\n"
                +  "8. Set total tips\n"
                +  "9. Set alcohol sales\n"
                + "10. Set bar tip out\n"
                + "11. Calculate net tips for the shift\n"
                + "12. Display all field variables for the item\n"
                + "13. Exit\n"));
        }
        return menuChoice;
    }
}
