package pkg25.pkg01.pkg26.java;

import java.util.Scanner;

public class Java {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter Second ");
        int seconds = scanner.nextInt();

        int minutes = seconds / 60;

        int second = seconds % 60;

        String minMessage = " Minute ";
        
        System.out.println(minutes + minMessage + second + "Seconds");

    }

}
