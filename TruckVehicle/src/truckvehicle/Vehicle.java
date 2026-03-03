

package truckvehicle;


public class Vehicle {
    
    int speed;
    double regularprice;
    String color;

    public Vehicle() {
    }

    public Vehicle(double regularprice) {
        this.regularprice = regularprice;
    }
    
    public double getSealprice(){
        return regularprice;
    }
    
}
