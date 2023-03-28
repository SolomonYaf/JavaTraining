import java.util.Scanner;

public class IfElseAssignment1 {
    public static void main(String[] args) {


        //1. Write a Java program that prompts the user to enter a number and then checks whether
        // the number is positive or negative.


        Scanner scanner = new Scanner(System.in);


//        System.out.println(" Please insert integer number");
//

//         int inputNumber = scanner.nextInt();
//
//        if (inputNumber>0) {
//            System.out.println(" The number you insert is \'POSITIVE\' ");
//            if (inputNumber%2==0)
//                System.out.println(" number is even");
//        } else if (inputNumber<0) {
//            System.out.println(" The number you insert is \'NEGATIVE\'");
//            if (inputNumber%2!=0)
//                System.out.println(inputNumber+" is odd ");
//
//        }
//        else
//            System.out.println(" The number you insert is \'ZERO\'");

        System.out.println(" insert First Number");
        int firstNumber = scanner.nextInt();

        System.out.println(" insert Second Number");
        int secondNumber = scanner.nextInt();

        System.out.println(" insert third Number");
        int thirdNumber = scanner.nextInt();
//        if(firstNumber>secondNumber && secondNumber>thirdNumber) {
//
//            System.out.println(firstNumber + " is largest");
//
//        }
//        else if (secondNumber>firstNumber && secondNumber>thirdNumber) {
//            System.out.println(secondNumber + " is largest");
//        }
//        else
//            System.out.println(thirdNumber+ " is largest");
        if(firstNumber>secondNumber) {
            if (firstNumber > thirdNumber)
                System.out.println(firstNumber + " is largest");
            else
                System.out.println(thirdNumber + " is largest");
        }
        else if (secondNumber>thirdNumber)
            System.out.println(secondNumber + " is largest");

        else
            System.out.println(thirdNumber + " is largest");

        }
    }






