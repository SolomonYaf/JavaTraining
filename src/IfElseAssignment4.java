import java.util.Scanner;

public class IfElseAssignment4 {
    public static void main(String[] args) {

        //4. Write a Java program that prompts the user to enter their age and then checks whether they
        // are eligible to vote.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert your age");
        byte age = scanner.nextByte();

        if (age>18) {
            System.out.println(" You are ELIGIBLE to VOTE");
        }
        else
            System.out.println(" You are INELIGIBLE to VOTE");
        }

    }

