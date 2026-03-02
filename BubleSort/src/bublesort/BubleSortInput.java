package bublesort;

import java.util.Arrays;
import java.util.Scanner;

public class BubleSortInput {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("How many numbers you sort");
        int n = s.nextInt();
        int numbers[]= new int[n];
        
        for(int i=0; i<numbers.length; i++){
            System.out.println("Enter Numbers");
            numbers[i] = s.nextInt();
        }
        
        for(int i=0; i<numbers.length-1; i++){
            for(int j=0; j<numbers.length-1-i; j++){
                
                if(numbers[j]>numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        } 
        System.out.println("Sorted Number " + Arrays.toString(numbers));

    }

}
