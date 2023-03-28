import java.util.Scanner;

public class IfElseAssignment2 {
    public static void main(String[] args) {

        //2. Write a Java program that prompts the user to enter two numbers and then checks whether the first number
        //is greater than, less than, or equal to the second number.

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Please Insert First Number");
        int firstNumber = scanner.nextInt();

        System.out.println(" Please Insert Second Number");
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " (First Number) is greater than " + secondNumber+"(Second Number)");
        }
        else if (firstNumber < secondNumber){
                System.out.println(secondNumber +" (Second Number) is greater than "+firstNumber+"(First Number)");
        }
        else
                System.out.println(firstNumber + " (First Number) and " +secondNumber+" (Second Number) are equal ");
        }

    }

