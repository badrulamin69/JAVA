
package bublesort;

import java.util.Arrays;


public class BubleSort {

    public static void main(String[] args) {
        
        int numbers[] = {52, 85, 96, 241, 47};
        
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
