
package learnobjectclass;

import learnobjectclass.geometry.Circle;


public class LearnObjectClass {

    
    public static void main(String[] args) {
        
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
