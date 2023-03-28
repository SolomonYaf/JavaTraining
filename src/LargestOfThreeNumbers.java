import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" insert first Number");
        int firstNumber = scanner.nextInt();

        System.out.println(" insert Second Number");
        int secondNumber = scanner.nextInt();

        System.out.println(" insert third Number");
        int thirdNumber = scanner.nextInt();
 //       if (firstNumber > secondNumber && secondNumber > thirdNumber) {
//
//            System.out.println(firstNumber + " is largest");
//
//        }
//        else if (secondNumber>firstNumber && secondNumber>thirdNumber) {
//            System.out.println(secondNumber + " is largest");
//        }
//        else
//            System.out.println(thirdNumber+ " is largest");
            if (firstNumber > secondNumber) {
                if (firstNumber > thirdNumber)
                    System.out.println(firstNumber + " is largest");
                else
                    System.out.println(thirdNumber + " is largest");
            }
            else if (secondNumber > thirdNumber)
                System.out.println(secondNumber + " is largest");

            else
                System.out.println(thirdNumber + " is largest");

        }
    }

