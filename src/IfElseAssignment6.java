import java.util.Scanner;

public class IfElseAssignment6 {
    public static void main(String[] args) {
        //Write a Java program that prompts the user to enter a year and then checks whether the year is a leap year.

        Scanner scanner =new Scanner(System.in);
        System.out.println(" Please insert the year");
        int year = scanner.nextInt();

        if(year%4==0 && year%100!=0){
            System.out.println(year+" is leap year");
        }
        else if (year%4==0 && year%100==0 &&year%400==0) {
            System.out.println(year+" is leap year");
        } else
            System.out.println(year+" is not leap year");

    }
}
