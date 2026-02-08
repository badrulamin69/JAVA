package calculatefinalprice;

public class POS {

    public double calculatefinalprice(double unitPrice, double quanTity) {
        double price = quanTity * unitPrice;

        double actual = 0;

        if (price <= 500) {
            actual = price - (price * .10);
        } else if(price <=1000){
            actual = price - (price * .20);
        } else {
            actual = price - (price * .5);
        }

        return actual;
    }

}
