
package learnobjectclass.geometry;


public class Calculator {
    
    public double a;
    public double b;
    
    public Calculator(){
    }

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    public double addition(){
        return (a + b);
    }
    public double subtraction(){
        return (a - b);
    }
    public double multiplication(){
        return (a * b);
    }
    public double dividation(){
        return (a / b);
    }
    public double modulas(){
        return (a % b);
    }
    
    
}
