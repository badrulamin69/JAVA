package truckvehicle;

public class Truck extends Vehicle {

    int weight;

    public Truck(int weight) {
        this.weight = weight;
    }

    public Truck(int weight, double regularprice) {
        super(regularprice);
        this.weight = weight;
    }

    @Override
    public double getSealprice() {

        if (weight > 2000) {
            return regularprice - (regularprice * .10);
        } else {
            return regularprice;
        }

    }

}
