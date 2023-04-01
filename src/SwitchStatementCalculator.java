import java.util.Scanner;

public class SwitchStatementCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Please insert first number");
         int firstNumber = scanner.nextInt();
        System.out.println(" Please insert Second number");
         int secondNumber = scanner.nextInt();

//        System.out.println(" + ");
//        System.out.println(" -");
//        System.out.println( " *");

        String sign="*";
        int operation = 0;

        switch (sign){
            case "+":
            operation=firstNumber +secondNumber;
            break;
            case "-":
                operation=firstNumber - secondNumber;
                break;
            case "*":
                operation=firstNumber *secondNumber;
                break;

            default:
                System.out.println(" insert correct operation");
                break;


        }
        System.out.println(operation);

    }
}
