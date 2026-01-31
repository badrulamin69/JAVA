package primenumber;

import java.util.Scanner;

public class Primenumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int count = 0;
        for (int i = 1; i <= number; i++) {
            
            if (number % i == 0)
            count += 1;
        }

        if (count == 2) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }

    }

}
