import java.util.Scanner;

public class IfElseAssignment9 {
    public static void main(String[] args) {


//        9. Write a Java program that prompts the user to enter a number and then checks whether the
//        number is a prime number.

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please insert a number ");
        int number = scanner.nextInt();
        int i=2;

        if (number % i == 0 && i!=1 && i!=number) {

            System.out.println(number + " is not prime number");

        }
        else
            System.out.println(number+ " is prime number");
    }
}