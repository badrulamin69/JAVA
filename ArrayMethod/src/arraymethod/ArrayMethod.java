
package arraymethod;


public class ArrayMethod {

    
    public static void main(String[] args) {
        
        
        sumMultiDimensionalArry(myArray);
       
    }
    
    public static void sumMultiDimensionalArry(int[][] myArray){
        
        int sum = 0;
        
        for(int[] row: myArray){
            for(int col : row){
                sum += col;
            }
        }
        System.out.println(sum);
    
    }
    
}
