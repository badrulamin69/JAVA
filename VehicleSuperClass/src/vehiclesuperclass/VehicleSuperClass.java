
        
    public class VehicleSuperClass {

        int speed;
        double regularPrice;
        String color;

        public VehicleSuperClass(int speed, double regularPrice, String color) {
            this.speed = speed;
            this.regularPrice = regularPrice;
            this.color = color;
        }

        public double getSalePrice() {
            
            return regularPrice;
        }
    }


