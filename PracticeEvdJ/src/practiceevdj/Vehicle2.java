
package practiceevdj;


public class Vehicle2 {

    int speed;
    double regularPrice;
    String color;

    public Vehicle2() {
    }

    public Vehicle2(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getSalePrice() {
        return regularPrice;
    }
    
}
