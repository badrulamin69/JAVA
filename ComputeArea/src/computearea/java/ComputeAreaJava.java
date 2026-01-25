package computearea.java;

import java.util.Scanner;

public class ComputeAreaJava {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Second");
        int seconds = scanner.nextInt();
        
        int minutes = seconds / 60;
        
        int second = seconds % 60;
        
        String minMessage = "Minute";

        System.out.println(minutes + minMessage + second + " Seconds ");

//       Scanner input = new Scanner(System.in);
//       float area;
//        System.out.println("Pls Enter Radius");
//        float radius = input.nextFloat();
//        
//        area =(float) 3.1416 * radius * radius;
//        
//        System.out.println("Area of a circle is " + area);
//        Scanner input = new Scanner(System.in);
//        String name;
//        System.out.println("What is your name");
//
//        name = input.nextLine();
//        
//        System.out.println("My name is "+ name);
//        float radius;
//        float area;
////      double area;
//        radius = 5;
//        
//        area = (float) 3.1416 * radius * radius;
//        System.out.println("Area of a circle is " + area);
    }

}

//25-01-26 java class........

