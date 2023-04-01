import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter the month");

        byte month = scanner.nextByte();

        String monthOfTheYear;

        switch (month) {
            case 1:
                monthOfTheYear = "January";
                break;
            case 2:
                monthOfTheYear = "February";
                break;
            case 3:
                monthOfTheYear = "March";
                break;
            case 4:
                monthOfTheYear = "April";
                break;
            case 5:
                monthOfTheYear = " May";
                break;
            case 6:
                monthOfTheYear = " June";
                break;
            case 7:
                monthOfTheYear = " July";
                break;
            case 8:
                monthOfTheYear = " August";
                break;
            case 9:
                monthOfTheYear = " September";
                break;
            case 10:
                monthOfTheYear = " October";
                break;
            case 11:
                monthOfTheYear = " November";
                break;
            case 12:
                monthOfTheYear = " December";
                break;
            default:
                monthOfTheYear = " Please enter a valid number";
                break;
        }
        System.out.println(monthOfTheYear);



        }

    }

