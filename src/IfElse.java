import java.time.Year;
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please insert DateOfBirth");
        int dateOfBirth = scanner.nextInt();
        int age = (Year.now().getValue())-dateOfBirth;// to automatically change the year of now ( example int age=2023-dateOfBirth)

        if(age<18)
            System.out.println(" is under-age ");

        else if (age>18 && age<50)

            System.out.println("is Adult");

        else

            System.out.println("old");

//        Scanner scanner = new Scanner(System.in);
//        System.out.println(" Please insert number");
//        int number= scanner.nextInt();
//        if(number%3==0 && number%5==0) {
//            System.out.println("FizzBuzz");
//        }
//        else if (number%5==0) {
//            System.out.println("Buzz");
//        }
//        else if (number%3==0) {
//            System.out.println("Fizz");
//        }
//        else
//            System.out.println(number);

    }

}

