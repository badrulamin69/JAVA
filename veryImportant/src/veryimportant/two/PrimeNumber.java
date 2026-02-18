package veryimportant.two;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter number");
        int number = s.nextInt();

        if (number % 2 == 0) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
