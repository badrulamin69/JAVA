
package testinheritence;

import testinheritence.in.Truck;


public class TestInheritence {

   
    public static void main(String[] args) {
        
        Truck truck = new Truck();
        truck.weight = 3000;
        truck.regularPrice = 5000;
        
        System.out.println(truck.getSalePrice());
    }
    
}
