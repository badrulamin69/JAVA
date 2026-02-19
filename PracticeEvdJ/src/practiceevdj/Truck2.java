package practiceevdj;

public class Truck2 extends Vehicle2 {

    int weight;

    public Truck2(int weight) {
        this.weight = weight;
    }

    public Truck2(int weight, double regularPrice) {
        super(regularPrice);
        this.weight = weight;
    }

   
    

    @Override
    public double getSalePrice() {

        if (weight > 2000) {
            return regularPrice - (regularPrice * .10);
        } else {
            return regularPrice;
        }
    }
}
