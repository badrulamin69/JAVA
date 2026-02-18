
package importantjava;

import java.util.Scanner;


public class Important {


    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your number");
        
        factorialNumber(s.nextInt());
        
        maxMin();
        
        oddEven(s.nextInt());
    }
    
    public static void factorialNumber(int input){
        
        int result = 1;
        for(int i=1; i<=input; i++){
            result = result * i;
        }
        
        System.out.println("Factorial number is " + result);
    }
    
    
    
    
    public static void maxMin(){
        
        int[] array = {10, 25, 85, 74, 64, 95};
        int max = 0;
        int min = array[0];
        
        for(int i=0; i<array.length; i++){
            if(max <=array[i]){
                max = array[i];
            }
        }
        
        for(int i=0; i<array.length; i++){
            if(min >=array[i]){
                min = array[i];
            }
        }
        
        System.out.println("Max number is " + max); 
        System.out.println("Min number is " + min);
    }
    
    public static void oddEven(int input){
        
        if(input % 2 == 0){
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
    
    
}
