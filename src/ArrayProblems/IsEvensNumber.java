package ArrayProblems;

public class IsEvensNumber {
    public static void main(String[] args) {
int x= 2668;
int y=458;
int z=6;
        System.out.println(isEvensNumber(x));
        System.out.println(isEvensNumber(y));
        System.out.println(isEvensNumber(z));

    }


    public static int isEvensNumber(int number) {
        while (number != 0) {
            int digit = number % 10;
            if (digit % 2!= 0)
                return 0;
            number=number/10;// do not put this line of code before (return) statement

        }
        return 1;
    }
}

