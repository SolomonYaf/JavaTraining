package JavaLoops;

public class Nested4LoopRightSided {
    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) {
            for (int j = i; j<=5; j++) {
                System.out.print(" \t");

            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*\t");
                
            }
            for (int j = 1; j<i; j++) {
                System.out.print("*\t");

            }
            System.out.println();
        }
    }
}
