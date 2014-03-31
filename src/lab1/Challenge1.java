package lab1;

import javax.swing.JOptionPane;

/**
 * The purpose of this challenge is to give you practice time using
 * Java Exception handling techniques.
 * <p>
 * Your challenge is to consider all the possible things that can go wrong
 * with this program and use exception handling where appropriate to prevent
 * the program from crashing. In addition you must display a friendly error
 * message in a JOptionPane and ask the user to try again. (Yes, this violates 
 * the Single Responsibility Principle, but for this lab, we'll overlook that.)
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Challenge1 {
    private static final int LAST_NAME_IDX = 1;

    public static void main(String[] args) {
        Challenge1 app = new Challenge1();
        
        String fullName = JOptionPane.showInputDialog("Enter full name (use Format: first last):");
        String lastName = null;
        
        try {
        lastName = app.extractLastName(fullName);
        } catch(IllegalArgumentException iae) {
            JOptionPane.showMessageDialog(null, iae.getMessage());
        }
        String msg = "Your last name is: " + lastName;
        JOptionPane.showMessageDialog(null, msg);
    }
    
    public String extractLastName(String fullName) throws IllegalArgumentException {
        fullName = fullName.trim();
        String[] nameParts = fullName.split(" ");
        if( fullName == null ){
        throw new IllegalArgumentException("Cant be null");
                }
        if (fullName.length() < 3){
            throw new IllegalArgumentException("Cant be less than 3");
                    }
        if (nameParts.length !=2){
            throw new IllegalArgumentException("Wrong format");
                }
        return nameParts[nameParts.length - 1];
    }

}
