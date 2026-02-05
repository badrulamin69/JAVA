
package multidiamensionalarrayfor;

import java.awt.BorderLayout;
import java.util.Arrays;


public class MultiDiamensionalArrayFor {

   
      public static void main(String[] args) {
        
        
        int numbers[][] = new int[3][4];
        
        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[0][2] = 3;
        numbers[0][3] = 4;
        
        numbers[1][0] = 4;
        numbers[1][1] = 6;
        numbers[1][2] = 7;
        numbers[1][3] = 8;
        
        numbers[2][0] = 9;
        numbers[2][1] = 10;
        numbers[2][2] = 11;
        numbers[2][3] = 12;
        
        for(int row= 0; row<numbers.length; row++){
            
            for(int col= 0; col < numbers[row].length; col++){
                System.out.print(numbers[row][col]+ "\t");
            }
            System.out.println("");
        }
        
//        System.out.println(Arrays.deepToString(numbers));
//        
//        int sum =0;
//        
//        for(int[] item : numbers){ // item 1,2,3
////            System.out.println(Arrays.toString(item));
//            for(int single : item){
//                sum += single;
//                System.out.print(single+"\t");
//            }
//            System.out.println("\n");
//        }
//        System.out.println("Total " + sum);
    }
    
}
