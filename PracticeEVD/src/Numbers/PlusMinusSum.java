package Numbers;

import java.util.Scanner;

public class PlusMinusSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int input = scanner.nextInt();
        int sum = 0;

        while (input >= 0) {
            sum = sum + input;
            System.out.println("Enter Number");
            input = scanner.nextInt();
        }
        scanner.close();
        System.out.println("Sum is " + sum);
    }
}
