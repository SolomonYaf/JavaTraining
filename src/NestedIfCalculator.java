import java.util.Scanner;

public class NestedIfCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print(" Enter First Number");
        double number1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print(" Enter Second Number");
        double number2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println(" what operation do you want to perform?");
        String operation = scanner.nextLine();

        if(operation.equalsIgnoreCase("sum")){
            System.out.printf(" %f +%f=%f", number1,number2, number1+number2);

        }
        else if (operation.equalsIgnoreCase("sub")) {
            System.out.printf(" %f -%f=%f", number1,number2, number1-number2);


        }
        else if (operation.equalsIgnoreCase("division")) {
            if(number2==0){
                System.out.println(" Can not divide by zero! ");
            }
            else {
                System.out.printf(" %f /%f=%f", number1,number2, number1/number2);

            }


            } else if (operation.equalsIgnoreCase("cos")) {
            System.out.printf("%f/%f = %f",number1,number2,(Math.cos(number1/number2)));

        } else
            System.out.println("%s is not supported operation");




            scanner.close();

    }
}
