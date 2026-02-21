package Numbers;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int input = scanner.nextInt();

        if (input % 2 == 0) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
