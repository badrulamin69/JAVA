package questionans;

public class QuestionAns {

    public static void main(String[] args) {
        // Superclass Vehicle
//    public class Vehicle {
        // Fields

        int speed;
        double regularPrice;
        String color;

        // Constructor
        public Vehicle(int speed, double regularPrice, String color) {
            this.speed = speed;
            this.regularPrice = regularPrice;
            this.color = color;
        }

        // Method to calculate sale price
        public double getSalePrice() {
            return regularPrice; // Default implementation returns regular price
        }
    }

}

}
