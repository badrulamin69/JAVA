
package array;

import java.util.Arrays;


public class Array {

    public static void main(String[] args) {
        
        String studentsName[] = new String[14];
        int studentsAge[] = new int[14];
        
//        int numbers[] = {10,20,55,47,74};
        
        studentsName[0]= "Badrul";
        studentsName[1]= "Shimul";
        studentsName[4]= "Hasan";
        
        studentsAge[0]= 20;
        studentsAge[1]= 22;
        studentsAge[3]= 23;
        
        System.out.println(studentsAge);
        System.out.println(studentsName);
        
        System.out.println(Arrays.toString(studentsName));
        System.out.println(Arrays.toString(studentsAge));
       
    }
    
}
