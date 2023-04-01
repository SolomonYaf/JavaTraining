import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.println("Please Enter Your Name");

       String customerName = scanner.next();

        System.out.println("Dear "+ customerName +" Please Enter Your Salary");
        float salary = scanner.nextFloat();

        System.out.println("Dear "+ customerName +" Please Enter Your Loan Amount");
        float loanAmount = scanner.nextFloat();

        System.out.println("Dear "+ customerName +" Please Enter Saving Amount");
        float savingAmount = scanner.nextFloat();

        System.out.println("Dear "+ customerName +" Are You Free From Criminal Record? if yes enter true if no enter false");
        String freeFromCriminalRecord = scanner.next();

        System.out.println("Dear "+ customerName +" for how many consecutive months did you save?");
        int savingDurationInMonths = scanner.nextInt();
    }
}
