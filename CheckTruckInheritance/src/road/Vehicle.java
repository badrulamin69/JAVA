
package road;


public class Vehicle {
    
    public int speed;
    public String color;
    public double regularprice;

    public Vehicle() {
    }

    public Vehicle(double regularprice) {
        this.regularprice = regularprice;
    }
    
    public double getsealprice(){
        return regularprice;
    }
    
}
