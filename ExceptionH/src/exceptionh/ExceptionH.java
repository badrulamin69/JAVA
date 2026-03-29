/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exceptionh;

/**
 *
 * @author Admin
 */
public class ExceptionH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            int j = 10/0;
        } catch (Exception e) {
            System.out.println("Invalid");
        }
       
    }
    
}
