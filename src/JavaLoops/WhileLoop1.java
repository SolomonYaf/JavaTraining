package JavaLoops;

import java.util.Scanner;

public class WhileLoop1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float sum =0;
        int count =0;
        float result =0;
        while(result>=0){
            System.out.println(" please insert your result");
            result = scanner.nextFloat();
            sum+=result;
            count++;

        }
        System.out.println(sum/count);
    }
}
