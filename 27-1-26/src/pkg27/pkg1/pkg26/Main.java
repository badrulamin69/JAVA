
package pkg27.pkg1.pkg26;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Radius");
        float radius = scanner.nextFloat();
        float areaOfCircle;
        if(radius <= 0){
            System.out.println("Incorrect Radious");
        }
        else{
            areaOfCircle = (float) (Math.PI * Math.pow(radius, radius));
            
//            areaOfCircle = (float) (3.1416 * radius * radius);
            
            System.out.println("Area of Circle is " + areaOfCircle);
        }
    }
    
}
