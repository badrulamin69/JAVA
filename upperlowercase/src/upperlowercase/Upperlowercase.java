
package upperlowercase;

import java.util.Scanner;


public class Upperlowercase {

   
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Name");
        
        String name = s.next();
        
//        String firstChar = name.substring(0, 1).toUpperCase();
//        String lastPart = name.substring(1).toLowerCase();
//        
//        String newName = firstChar + lastPart;


        String firstChar = name.substring(0, 1).toUpperCase();
        String middlePart = name.substring(1, name.length()-1).toLowerCase();
        
        String newName = firstChar + lastPart;
        
        System.out.println("newName");
        
        
        
        
        

    }
    
}
