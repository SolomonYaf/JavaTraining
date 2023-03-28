import java.util.Scanner;

public class NestdeIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Please insert Gender");
        String gender = scanner.nextLine();



        if(gender.equalsIgnoreCase("male")) {
            System.out.println(" Please insert age");
            int age = scanner.nextInt();
            if (age >47)
                System.out.println("  not eligible");
            else if (age >18)
                System.out.println(" not eligible");
        } else if (gender.equalsIgnoreCase("female")) {
            System.out.println(" Please insert age");
            int age = scanner.nextInt();
            if(age<18)
                System.out.println("Under age");
            else
                System.out.println(" Adult");

        }

    }
}
