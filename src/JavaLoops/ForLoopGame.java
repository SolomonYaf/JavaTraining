package JavaLoops;

import java.util.Random;
import java.util.Scanner;

public class ForLoopGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        for(int i=1; i>=1; i++) {
            System.out.println(" Please Guess a number from 1 to 10");
            int guessNumber = scanner.nextInt();

            int computerNum= (byte)(Math.random()*10);
            System.out.println(computerNum);

            if(computerNum==guessNumber){
                System.out.println(" Congratulations");
                break;

            }
            else
                System.out.println(" Try again");

        }
    }

}
