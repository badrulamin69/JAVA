
package learnobjectclass;

import learnobjectclass.geometry.Calculator;
import learnobjectclass.geometry.Circle;


public class LearnObjectClass {

    
    public static void main(String[] args) {
        
        Calculator calculator = new Calculator(32, 2);
        
        System.out.println(calculator.addition());
        System.out.println(calculator.subtraction());
        System.out.println(calculator.multiplication());
        System.out.println(calculator.dividation());
        System.out.println(calculator.modulas());
        
        Circle circle = new Circle();
        circle.radius = 15;
        
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        
        Circle circle1 = new Circle();
        circle1.radius = 5;
        
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
         
    }
    
}
