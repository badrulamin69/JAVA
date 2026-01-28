
package oddeven;

import java.util.Scanner;


public class Oddeven {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1");
        int nu1 = input.nextInt();
        
        System.out.println("Enter number 2");
        int nu2 = input.nextInt();
        
        System.out.println("Enter + - / * ");
        String op = input.next();
        
        if (op.equals("+")){
            System.out.println(nu1 + nu2);
        } else if (op.equals("-")){
            
            System.out.println(nu1 - nu2);
        } else if (op.equals("*")){
        
            System.out.println(nu1 * nu2);
        } else if (op.equals("/")){
        
            System.out.println(nu1 / nu2);
        }
        
   }
}

//        System.out.println("Enter");
        
        
        
        
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter number");
//        
//        int number = 
//        
//        if (number % 2 = 0 ) {
//            System.out.println("Even");
//        } else {
//            System.out.println("Odd");
//        }
//    }
//    
//}
