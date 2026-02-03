
package arraysinitialization;

import java.util.Arrays;
import java.util.Scanner;


public class Arraysinitialization {


    public static void main(String[] args) {
      
        Scanner s = new Scanner(System.in);
        System.out.println("How many numbers do you want to compare?");
        int n = s.nextInt();
        
        int numbers[] = new int[n];
        
        System.out.println("Beginning of loop" + Arrays.toString(numbers));
        for(int index=0; index < n; index++){
            System.out.println("Enter your" + (index + 1) + "number");
            int userInput = s.nextInt();
            
            numbers[index] = userInput;
        }
        System.out.println("Ending of loop " + Arrays.toString(numbers));
        
        findMaxNumber(numbers);
        findMinNumber(numbers);
        findAvgNumbers(numbers);
      
      
       
    }
    public static void findMaxNumber(int[] numbers){
        int max = 0;
        
        for (int item : numbers){
            if (item >= max){
                max = item;
            }
        }
        
        System.out.println("Max number is " + max);
    }
    
    public static void findMinNumber(int[] numbers){
        int min = numbers[0];
        
        for (int item : numbers){
            if (item <= min){
                min = item;
            }
        }
        
        System.out.println(" Min number is " + min);
    }
    
    public static void findAvgNumbers(int[] numbers){
        float avg = 0;
        int size = numbers.length;        
        int sum =0;
        
        for (int item : numbers){
            sum += item;
        }
        
        avg = sum / size;
        System.out.println("Average is" + avg);
    }
        
}

