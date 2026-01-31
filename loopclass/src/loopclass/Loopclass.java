package loopclass;

import java.util.Scanner;

public class Loopclass {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 10);
        System.out.println(randomNumber);
        int chance = 3;
        boolean win = false;
        
        System.out.println("Guess a number between 0-9");

        while (chance >= 1) {
            
            System.out.println("Enter your guess(" + chance + " chances left): ");
            int guessNumber = s.nextInt();
            
            if (guessNumber == randomNumber) {
                System.out.println("You Win");
                win = true;
                break;

            } else if (guessNumber > randomNumber) {
                System.out.println("Your guess number is too large.");

            } else (guessNumber < randomNumber) {
                System.out.println("Your guess number is too small.");
            }
           chance--;

        }
        
        if(!win){
            System.out.println("Better luck next time!");
        }
        
        System.out.println("System guees this "+ randomNumber);
    }
   }
