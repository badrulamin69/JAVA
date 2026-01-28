package twowayifelse;

import java.util.Scanner;

public class Twowayifelse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight");
        float weight = scanner.nextFloat();

        if (weight < 18.5) {
            System.out.println("Underweight");

        } else if (weight <= 25.0) {
            System.out.println("Normal");
        } else if (weight < 30.0) {
            System.out.println("Overweight");
        } else {
            System.out.println("obease");
        }

    }

}
 