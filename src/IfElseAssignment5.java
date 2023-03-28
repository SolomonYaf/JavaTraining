import java.util.Scanner;

public class IfElseAssignment5 {
    public static void main(String[] args) {

//        5. Write a Java program that prompts the user to enter their username and password and then checks
//        whether the username and password are correct.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert your USER NAME");
        String userName = scanner.nextLine();

        System.out.println(" Please insert your six digit PASSWORD");
        String passWord = scanner.nextLine();

        if (userName.equals("Solomon") && passWord.equals("123456")) {
            System.out.println("User Name and Password are correct");
        }
        else
            System.out.println("Either User name or password is NOT correct");
    }
}
