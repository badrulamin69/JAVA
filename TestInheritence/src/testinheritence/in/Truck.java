
package testinheritence.in;

public class Truck extends Vehicle {

    public int weight;

    public Truck() {
    }

    public Truck(int weight) {
        this.weight = weight;
    }

    public Truck(int weight, int speed, double regularPrice, String color) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        if (weight > 2000) {
            return super.regularPrice - (super.regularPrice* .10);
//  return super.regularPrice * .90); simillar equation simillar result
        } else {
            return regularPrice;
        }
    }

}
