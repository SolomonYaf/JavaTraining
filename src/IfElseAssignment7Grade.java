import java.util.Scanner;

public class IfElseAssignment7Grade {
    public static void main(String[] args) {

        //7. Write a Java program that prompts the user to enter their grade and then prints out whether
       // they passed or failed the class.

        Scanner scanner =new Scanner(System.in);
        System.out.println(" Please insert your grade in capital Letters");
        String grade = scanner.nextLine();

//        if(grade.equals("A+")||grade.equals("A" )||grade.equals("A-")|| grade.equals("B+")||grade.equals("B") ||
//                grade.equals("B-")||grade.equals("C+")||grade.equals("C"))
//        {
//            System.out.println("You PASSED the class");
//        }
//        else {
//            System.out.println("You FAILED the class");
//        }
        switch (grade) {
            case "A+":
            case "A":
            case "A-":
            case "B+":
            case "B":
            case "B-":
            case "C+":
            case "C":
                System.out.println("Passed the class");
                break;
            default:
                System.out.println("Failed the class");
        }

    }
}
