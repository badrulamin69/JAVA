package createtwodiamensionalarray;

import java.util.Arrays;
import java.util.Scanner;

public class CreateTwoDiamensionalArray {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Row Size");
        int rowSize = s.nextInt();

        System.out.println("Enter Column Size");
        int colSize = s.nextInt();

        int numbers[][] = new int[rowSize][colSize];

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {

                System.out.println("Enter value for row " + (row + 1) + " Col " + (col + 1));
                int userInput = s.nextInt();
                numbers[row][col] = userInput;
            }
        }
        System.out.println(Arrays.deepToString(numbers));

        int sum = 0;

        for (int[] item : numbers) { // item 1,2,3
//            System.out.println(Arrays.toString(item));
            for (int single : item) {
                sum = sum + single;
                System.out.print(single + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("Total " + sum);
    }

}


