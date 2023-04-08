package JavaLoops;

public class Nested4LoopIncreasingTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {// the outer loop holds the number of rows
            for (int j = 1; j <= i; j++) {// the inner loop holds the number of columns

                System.out.print("*\t");// prints the inner loop values in the same row

            }
            System.out.println();// this is the last statement of the outer loop and prints the next row once
            // the inner loop executes
        }
    }
}
