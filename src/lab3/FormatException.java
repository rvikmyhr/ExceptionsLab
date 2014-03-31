/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab3;

/**
 *
 * @author Ron
 */
public class FormatException extends IllegalArgumentException {
    private static final String message = "Name uses incorrect format";
    
    public FormatException(){
        super(message);
    }
    
    public FormatException(String msg){
        super(message);
    }
    
    public FormatException(String msg, Throwable cause){
        super(message, cause);
    }
    public FormatException(Throwable cause){
        super(cause);
    }
    
    @Override
    public String getMessage(){
        return message;
    }
}
