import java.util.Scanner;

public class IfElseAssignment10 {
    public static void main(String[] args) {

//        10. Write a Java program that prompts the user to enter their salary and then calculates their
//        net salary after deducting taxes based on their income level.

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please insert your Salary ");
        int salary = scanner.nextInt();

        if(salary>10900) {
            System.out.println("Your net income after taxes and pension contribution is " +
                    ((salary - salary * 0.35 - salary * 0.07) + 1500));
        }
        else if (salary>7800) {
            System.out.println("Your net income after taxes and pension contribution is " +
                    ((salary - salary * 0.3 - salary * 0.07) + 955));
        }
        else if (salary>5250) {
            System.out.println("Your net income after taxes and pension contribution is " +
                    ((salary - salary * 0.25 - salary * 0.07) + 565));
        }
        else if (salary>3200) {
            System.out.println("Your net income after taxes and pension contribution is " +
                    ((salary - salary * 0.2 - salary * 0.07) + 302.5));
        }
        else if (salary>1600) {
            System.out.println("Your net income after taxes and pension contribution is " +
                    ((salary - salary * 0.15 - salary * 0.07) + 142.5));
        }
        else if (salary>600) {
            System.out.println("Your net income after taxes and pension contribution is " +
                    ((salary - salary * 0.10 - salary * 0.07) + 60));
        }
        else
            System.out.println("Your net income after taxes and pension contribution is " +salary);


        }
    }

