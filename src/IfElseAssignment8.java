import java.util.Scanner;

public class IfElseAssignment8 {
    public static void main(String[] args) {
        //8. Write a Java program that prompts the user to enter a number between 1 and 7 and then prints out
        // the corresponding day of the week.

        Scanner scanner =new Scanner(System.in);
        System.out.println(" Please insert a number between 1&7 including");
        int day = scanner.nextInt();

//        if(day==1){
//            System.out.println("Day "+day+"  of the week is Monday");
//
//        } else if (day==2) {
//            System.out.println("Day "+day+"  of the week is Tuesday");
//        } else if (day==3) {
//            System.out.println("Day "+day+"  of the week is Wednesday");
//
//        } else if (day==4) {
//            System.out.println("Day "+day+"  of the week is Thursday");
//
//        } else if (day==5) {
//            System.out.println("Day "+day+"  of the week is Friday");
//
//        } else if (day==6) {
//            System.out.println("Day "+day+"  of the week is Saturday");
//
//        } else if (day==7) {
//            System.out.println("Day "+day+"  of the week is Sunday");
//
//        }
//        else
//            System.out.println("Please insert a correct number");
switch (day){
    case 1:
        System.out.println("Day "+day+"  of the week is Monday");
        break;
    case 2:
        System.out.println("Day "+day+"  of the week is Tuesday");
        break;
    case 3:
        System.out.println("Day "+day+"  of the week is Wednesday");
        break;
    case 4:
        System.out.println("Day "+day+"  of the week is Thursday");
        break;
    case 5:
        System.out.println("Day "+day+"  of the week is Friday");
        break;
    case 6:
        System.out.println("Day "+day+"  of the week is Saturday");
        break;
    case 7:
        System.out.println("Day "+day+"  of the week is Sunday");
        break;
    default:
        System.out.println("Please insert a valid number");

}

    }
    }

