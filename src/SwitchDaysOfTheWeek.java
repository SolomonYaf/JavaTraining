import java.util.Scanner;

public class SwitchDaysOfTheWeek {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String dayOfTheWeek=" Monday";

        System.out.println(" Please Enter day of the week");

        byte day = scanner.nextByte();

        switch (day){
            case 1:
                dayOfTheWeek = "Monday";
                break;
            case 2:
                dayOfTheWeek = "Tuesday";
                break;
            case 3:
                dayOfTheWeek = "Wednesday";
                break;
            case 4:
                dayOfTheWeek = "Thursday";
                break;
            case 5:
                dayOfTheWeek = "Friday";
                break;
            case 6:
                dayOfTheWeek = "Saturday";
                break;
            case 7:
                dayOfTheWeek = "Sunday";
                break;
            default:
                System.out.println(" Please insert a valid number");
        }
        System.out.println(dayOfTheWeek);
    }
}
